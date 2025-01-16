package it.quantyca.protobuf;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import it.quantyca.protobuf.EmployeeProtos.Employee;


public class ProtobufMessageWriter {

        public static void main(String[] args) {     
                  
                // Create and write some sample records
                List<Employee> employees = new ArrayList<Employee>();
                System.out.println("Generated Employee Messages:");
                for (int i = 1; i <= 5; i++) {
                        Employee employee = Employee.newBuilder()
                        .setId(i)
                        .setName("Employee " + i)
                        .setDepartment( i % 2 == 0 ? "Engineering" : "Marketing")
                        .setSalary(50000.0 + (i * 10000))
                        .build();

                        System.out.println(employee);

                        employees.add(employee);
                }

                // Save the messages to a file
                try (FileOutputStream fos = new FileOutputStream("employees.dat")) {
                        for (int i = 0; i < 5; i++) {
                                Employee employee = employees.get(i);
                                employee.writeTo(fos);
                        }
                        System.out.println("Employee messages have been saved to employees.dat");
                } catch (IOException e) {
                        System.err.println("Error writing to file: " + e.getMessage());
                }
        }
}
