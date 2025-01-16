package it.quantyca.protobuf;

import com.google.protobuf.Descriptors;
import it.quantyca.protobuf.EmployeeProtos;

import java.io.IOException;

public class ProtobufSchemaPrinter {


    public static void main(String[] args) throws IOException {

        // Load the schema descriptor (you need to compile your .proto file first)
        Descriptors.FileDescriptor fileDescriptor = EmployeeProtos.getDescriptor();
        

        // Iterate through all message types in the file descriptor
        for (Descriptors.Descriptor descriptor : fileDescriptor.getMessageTypes()) {
            System.out.println("Message: " + descriptor.getFullName());

            // Iterate through fields in the message
            for (Descriptors.FieldDescriptor field : descriptor.getFields()) {
                // Print the field name
                System.out.println("Field: " + field.getName());

                // Check if the field has any extensions
                if (field.getOptions() != null) {
                    System.out.println("  Options: " + field.getOptions());
                }

                // Example: Access specific extensions (if applicable and defined in proto file)
                /*
                 * if (field.getOptions().hasExtension(MyExtension.extensionExample)) {
                 * String customProperty =
                 * field.getOptions().getExtension(MyExtension.extensionExample);
                 * System.out.println("    Custom Property: " + customProperty);
                 * }
                 */
            }
        }
    }
}
