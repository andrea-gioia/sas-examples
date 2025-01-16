package it.quantyca.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import it.quantyca.protobuf.EmployeeProtos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProtobufVocabulariesPrinter {

    private static void printExtensionDetails(FieldDescriptor extension) {
        System.out.println("  Extension Name: " + extension.getName());
        System.out.println("    Full Name: " + extension.getFullName());
        System.out.println("    Type: " + extension.getType());
        System.out.println("    Extends: " + extension.getContainingType().getFullName());
        System.out.println("    Number: " + extension.getNumber());
    }

    public static void main(String[] args) throws Exception {
        // Get the descriptor for the Employee message
        Descriptors.FileDescriptor employeeDescriptor = EmployeeProtos.getDescriptor();


        Set<String> vocabularies = new HashSet<String>();
        
        List<FieldDescriptor> messageKeywords = new ArrayList<FieldDescriptor>();
        List<FieldDescriptor> fieldKeywords = new ArrayList<FieldDescriptor>();
        for (FieldDescriptor extension : employeeDescriptor.getExtensions()) {
            String containingType = extension.getContainingType().getFullName();
            if("google.protobuf.MessageOptions".equals(containingType)) {
                messageKeywords.add(extension);
            } else if("google.protobuf.FieldOptions".equals(containingType)) {
                fieldKeywords.add(extension);
            }
        }

       
        System.out.println("SCHEMA ANNOTATIONS");
        for (int i =0; i<messageKeywords.size(); i++) {
            printExtensionDetails(messageKeywords.get(i));
        }

        System.out.println("PROPERTY ANNOTATIONS");
        for (int i =0; i<fieldKeywords.size(); i++) {
            printExtensionDetails(fieldKeywords.get(i));
        }



        List<FileDescriptor> dependecies = employeeDescriptor.getDependencies();
        for (FileDescriptor dependency : dependecies) {

           messageKeywords = new ArrayList<FieldDescriptor>();
           fieldKeywords = new ArrayList<FieldDescriptor>();

            for (FieldDescriptor extension : dependency.getExtensions()) {
                String containingType = extension.getContainingType().getFullName();
                if("google.protobuf.MessageOptions".equals(containingType)) {
                    messageKeywords.add(extension);
                } else if("google.protobuf.FieldOptions".equals(containingType)) {
                    fieldKeywords.add(extension);
                }
            }

           
            if(messageKeywords.size() == 0 && fieldKeywords.size() == 0) continue;

            vocabularies.add(dependency.getFullName());
            System.out.println("\n\n>>> " + dependency.getFullName());

            System.out.println("SCHEMA ANNOTATIONS");
            for (int i =0; i<messageKeywords.size(); i++) {
                printExtensionDetails(messageKeywords.get(i));
            }

            System.out.println("PROPERTY ANNOTATIONS");
            for (int i =0; i<fieldKeywords.size(); i++) {
                printExtensionDetails(fieldKeywords.get(i));
            }
        }

    }
}
