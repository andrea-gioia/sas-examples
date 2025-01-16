package it.quantyca.avro;
import org.apache.avro.Schema;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class AvroSchemaPrinter {

    public static void print(Schema schema) {
        try {
           
            // Print all schema-level properties
            System.out.println("=== Schema Level Properties ===");
            Map<String, Object> schemaProps = schema.getObjectProps();
            schemaProps.forEach((key, value) -> 
                System.out.println(key + ": " + value));

            // Print standard schema properties
            System.out.println("\n=== Standard Schema Properties ===");
            System.out.println("type: " + schema.getType());
            System.out.println("name: " + schema.getName());
            System.out.println("namespace: " + schema.getNamespace());

            // Print all field-level properties
            System.out.println("\n=== Field Level Properties ===");
            for (Schema.Field field : schema.getFields()) {
                System.out.println("\nField: " + field.name());
                
                // Print standard field properties
                System.out.println("type: " + field.schema().getType());
                
                // Print all custom properties for this field
                Map<String, Object> fieldProps = field.getObjectProps();
                fieldProps.forEach((key, value) -> 
                    System.out.println(key + ": " + value));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            // Read the schema from file
            String schemaString = new String(Files.readAllBytes(Paths.get("employee.avsc")));
            Schema schema = new Schema.Parser().parse(schemaString);
            AvroSchemaPrinter.print(schema);           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}