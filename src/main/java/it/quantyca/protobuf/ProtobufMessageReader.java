package it.quantyca.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import java.io.FileInputStream;
import java.io.IOException;

public class ProtobufMessageReader {
    public static void main(String[] args) {
        // Read the messages from the file
        try (FileInputStream fis = new FileInputStream("employees.binpb")) {
            System.out.println("Reading Employee Messages:");
            
            // Keep reading until we reach end of file
            while (fis.available() > 0) {
                try {
                    // Parse the next message
                    EmployeeProtos.Employee employee = EmployeeProtos.Employee.parseDelimitedFrom(fis);
                    if (employee == null) {
                        break;
                    }
                    
                    // Print the message details
                    System.out.println("\nEmployee Details:");
                    System.out.println("ID: " + employee.getId());
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Department: " + employee.getDepartment());
                    System.out.println("Salary: $" + employee.getSalary());
                    
                } catch (InvalidProtocolBufferException e) {
                    System.err.println("Error parsing protobuf message: " + e.getMessage());
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}