package it.quantyca.avro;

// TestAvroFileCreator.java
import org.apache.avro.Schema;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumWriter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AvroMessageWriter {
   public static void main(String[] args) {
        try {
            // Read the schema from file
            String schemaString = new String(Files.readAllBytes(Paths.get("employee.avsc")));
            Schema schema = new Schema.Parser().parse(schemaString);

            AvroSchemaPrinter.print(schema);

            // Create a file to store the Avro data
            File file = new File("employees.avro");

            // Create DatumWriter and DataFileWriter
            DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>(schema);
            DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<>(datumWriter);
            dataFileWriter.create(schema, file);

            // Create and write some sample records
            for (int i = 1; i <= 5; i++) {
                GenericRecord employee = new GenericData.Record(schema);
                employee.put("id", i);
                employee.put("name", "Employee " + i);
                employee.put("department", i % 2 == 0 ? "Engineering" : "Marketing");
                employee.put("salary", 50000.0 + (i * 10000));
                
                dataFileWriter.append(employee);
            }

            // Close the writer
            dataFileWriter.close();
            
            System.out.println("Successfully created Avro file: " + file.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
