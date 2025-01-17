package it.quantyca.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProtobufSchemaKeywordsPrinter {

    private static void printVocabulary(FieldDescriptor vocabulary, String type) {
        Descriptor messageDescriptor = vocabulary.getMessageType();

        // Print all fields of the message
        for (FieldDescriptor subField : messageDescriptor.getFields()) {
            for(Entry<Descriptors.FieldDescriptor,Object> entry: subField.getOptions().getAllFields().entrySet()) {
                if("targets".equals(entry.getKey().getName())){
                    boolean toPrint = false;
                    Collection<Descriptors.EnumValueDescriptor> targets = (Collection<Descriptors.EnumValueDescriptor>)entry.getValue();
                    for (Iterator<Descriptors.EnumValueDescriptor> it = targets.iterator(); it.hasNext(); ) {
                        if(it.next().getName().equals(type)) toPrint = true;
                    }
                    if(toPrint) {
                        System.out.println("     - " + subField.getName() + " (" + subField.getType() + ")");
                    }
                    
                }
            }
            
        }
    }

    private static void printKeywordDetails(FieldDescriptor extension) {
        System.out.println("  Extension Name: " + extension.getName());
        System.out.println("    Full Name: " + extension.getFullName());
        System.out.println("    Type: " + extension.getType());
        System.out.println("    Extends: " + extension.getContainingType().getFullName());
        System.out.println("    Number: " + extension.getNumber());
    }

    public static void printVocabularies(Descriptors.FileDescriptor employeeDescriptor) {
        Set<String> vocabularies = new HashSet<String>();

        System.out.println("\n\n");
        System.out.println("====================================================");
        System.out.println("FILE: " + employeeDescriptor.getFile().getName());
        System.out.println("====================================================");

        // A single file can contains multiple options of the same type. Ex. multiple FileOptions definitiosns.
        List<FieldDescriptor> fileKeywords = new ArrayList<FieldDescriptor>();
        List<FieldDescriptor> messageKeywords = new ArrayList<FieldDescriptor>();
        List<FieldDescriptor> fieldKeywords = new ArrayList<FieldDescriptor>();
        Map<String, FieldDescriptor> subVocabularies = new HashMap<String, FieldDescriptor>();

        for (FieldDescriptor extension : employeeDescriptor.getExtensions()) {
            String containingType = extension.getContainingType().getFullName();
            if("google.protobuf.FileOptions".equals(containingType)) {
                if("MESSAGE".equals(extension.getType().toString())) {
                    subVocabularies.put(extension.getMessageType().getName(), extension);
                } else {
                    fileKeywords.add(extension);
                }
            } else if("google.protobuf.MessageOptions".equals(containingType)) {
                 if("MESSAGE".equals(extension.getType().toString())) {
                    subVocabularies.put(extension.getMessageType().getName(), extension);
                } else {
                    messageKeywords.add(extension);
                }
            } else if("google.protobuf.FieldOptions".equals(containingType)) {
                if("MESSAGE".equals(extension.getType().toString())) {
                    subVocabularies.put(extension.getMessageType().getName(), extension);
                } else {
                    fieldKeywords.add(extension);
                }
            }
        }
       
        System.out.println("\n");
        System.out.println("  -----------------------------------------");
        System.out.println("  Inline vocabulary");
        System.out.println("  -----------------------------------------");
        
        System.out.println("  > FILE ANNOTATIONS (" + fileKeywords.size() + ")");
        for (int i =0; i<fileKeywords.size(); i++) {
            printKeywordDetails(fileKeywords.get(i));
        }

        System.out.println("  > OBJECT ANNOTATIONS (" + messageKeywords.size() +")");
        for (int i =0; i<messageKeywords.size(); i++) {
            printKeywordDetails(messageKeywords.get(i));
        }
        System.out.println("  > PROPERTY ANNOTATIONS (" + fieldKeywords.size() + ")");
        for (int i =0; i<fieldKeywords.size(); i++) {
            printKeywordDetails(fieldKeywords.get(i));
        }


        for(FieldDescriptor subVocabulary: subVocabularies.values()) {
            System.out.println("\n");
            System.out.println("  -----------------------------------------");
            System.out.println("  " + subVocabulary.getMessageType().getName());
            System.out.println("  -----------------------------------------");
            System.out.println("  > FILE ANNOTATIONS");
            printVocabulary(subVocabulary, "TARGET_TYPE_FILE");
            System.out.println("  > OBJECT ANNOTATIONS");
            printVocabulary(subVocabulary, "TARGET_TYPE_MESSAGE");
            System.out.println("  > PROPERTY ANNOTATIONS");
            printVocabulary(subVocabulary, "TARGET_TYPE_FIELD");
        }
    }

    public static void main(String[] args) throws Exception {
        // Get the descriptor for the Employee message
        Descriptors.FileDescriptor employeeDescriptor = EmployeeProtos.getDescriptor();

        // first print vocabularies containd in the proto file that contains the definition of EmployProtos
        printVocabularies(employeeDescriptor);

         // then print vocabularies containd in the included proto files
        List<FileDescriptor> dependecies = employeeDescriptor.getDependencies();
        for (FileDescriptor dependency : dependecies) {
            printVocabularies(dependency);
        }

    }
}
