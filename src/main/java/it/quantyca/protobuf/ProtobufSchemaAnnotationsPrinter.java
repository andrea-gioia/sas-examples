package it.quantyca.protobuf;

import com.google.protobuf.DescriptorProtos.FieldOptions;
import com.google.protobuf.DescriptorProtos.FileOptions;
import com.google.protobuf.DescriptorProtos.MessageOptions;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.GeneratedMessage;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class ProtobufSchemaAnnotationsPrinter {

    public static void printDescriptorOptions(Descriptors.FileDescriptor descriptor) {
        FileOptions options = descriptor.getOptions();
        for (Map.Entry<FieldDescriptor, Object> entry : options.getAllFields().entrySet()) {
            String optionFullName = entry.getKey().getFullName();
            String optionName = entry.getKey().getName();
            String optionNamePrefix = optionFullName.substring(0,optionFullName.indexOf(optionName)-1);
            Object optionValue = entry.getValue();
            if(entry.getValue() instanceof GeneratedMessage){
                GeneratedMessage voc = (GeneratedMessage)entry.getValue();
                for(Entry<FieldDescriptor, Object> d: voc.getAllFields().entrySet()){
                    System.out.println("  - (" + optionFullName + ")." + d.getKey().getName() + " - " + d.getValue());
                }
            } else {
                System.out.println("  - (" + optionNamePrefix + ")." + optionName + " - " + optionValue);
            }
        }
    }

    public static void printDescriptorOptions(Descriptors.Descriptor descriptor) {
        MessageOptions options = descriptor.getOptions();
        for (Map.Entry<FieldDescriptor, Object> entry : options.getAllFields().entrySet()) {
            String optionFullName = entry.getKey().getFullName();
            String optionName = entry.getKey().getName();
            String optionNamePrefix = optionFullName.substring(0,optionFullName.indexOf(optionName)-1);
            Object optionValue = entry.getValue();
            if(entry.getValue() instanceof GeneratedMessage){
                GeneratedMessage voc = (GeneratedMessage)entry.getValue();
                for(Entry<FieldDescriptor, Object> d: voc.getAllFields().entrySet()){
                    System.out.println("    - (" + optionFullName + ")." + d.getKey().getName() + " - " + d.getValue());
                }
            } else {
                System.out.println("    - (" + optionNamePrefix + ")." + optionName + " - " + optionValue);
            }
        }
    }

    public static void printDescriptorOptions(Descriptors.FieldDescriptor descriptor) {
        FieldOptions options = descriptor.getOptions();
        for (Map.Entry<FieldDescriptor, Object> entry : options.getAllFields().entrySet()) {
            String optionFullName = entry.getKey().getFullName();
            String optionName = entry.getKey().getName();
            String optionNamePrefix = optionFullName.substring(0,optionFullName.indexOf(optionName)-1);
            Object optionValue = entry.getValue();
            if(entry.getValue() instanceof GeneratedMessage){
                GeneratedMessage voc = (GeneratedMessage)entry.getValue();
                for(Entry<FieldDescriptor, Object> d: voc.getAllFields().entrySet()){
                    System.out.println("    - (" + optionFullName + ")." + d.getKey().getName() + " - " + d.getValue());
                }
            } else {
                System.out.println("    - (" + optionNamePrefix + ")." + optionName + " - " + optionValue);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        // Load the schema descriptor (you need to compile your .proto file first)
        Descriptors.FileDescriptor fileDescriptor = EmployeeProtos.getDescriptor();

        System.out.println("====================================================");
        System.out.println("FILE: " + fileDescriptor.getFile().getName());
        System.out.println("====================================================");

        printDescriptorOptions(fileDescriptor);

        // Iterate through all message types in the file descriptor
        for (Descriptors.Descriptor descriptor : fileDescriptor.getMessageTypes()) {
            System.out.println("  -----------------------------------------");
            System.out.println("  MESSAGE: " + descriptor.getName());
            System.out.println("  -----------------------------------------");

            printDescriptorOptions(descriptor);
           

            // Iterate through fields in the message
            for (Descriptors.FieldDescriptor field : descriptor.getFields()) {
                // Print field options
                System.out.println("\n  - " + field.getName());
                printDescriptorOptions(field);

            }
        }
    }
}
