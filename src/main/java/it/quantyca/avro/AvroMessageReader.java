package it.quantyca.avro;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;

import java.io.File;
import java.io.IOException;

public class AvroMessageReader {
    public static void main(String[] args) {
        // Replace with your Avro file path
        String avroFilePath = "employees.avro";
        
        try {
            // Create a GenericDatumReader for reading the Avro data
            DatumReader<GenericRecord> datumReader = new GenericDatumReader<>();
            
            // Create a DataFileReader to read the Avro file
            DataFileReader<GenericRecord> dataFileReader = new DataFileReader<>(
                new File(avroFilePath), datumReader);

            Schema schema = dataFileReader.getSchema();
            AvroSchemaPrinter.print(schema);
            
            // Read all records from the file
            while (dataFileReader.hasNext()) {
                GenericRecord record = dataFileReader.next();
                System.out.println(record);
                
                // Access specific fields if needed
                // Object fieldValue = record.get("fieldName");
                // System.out.println("Field value: " + fieldValue);
            }
            
            // Close the file reader
            dataFileReader.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

