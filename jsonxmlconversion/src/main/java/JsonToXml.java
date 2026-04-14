import java.io.IOException;
import java.io.InputStream;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXml {

    public static void main(String[] args) throws IOException {

        String root = "root"; // Creating a variable named root it stores the string "root"
        //XML must have one single top-level element, so we create it manually

        // Path path = Paths.get("src/main/resources/employee.json"); // Path to the JSON file

        // // Read full JSON file stores it as a String ex: "{ "root": { "Employees": { ... } } }"
        // String stringJson = Files.readString(path);

        InputStream is = JsonToXml.class
        .getClassLoader()
        .getResourceAsStream("employeejson.json");

        String stringJson = new String(is.readAllBytes());    

        JSONObject json = new JSONObject(stringJson); // Convert the String to a JSONObject structured data

        String xml = XML.toString(json); // Convert the JSONObject to XML String ex: "<root><Employees>...</Employees></root>"

        System.out.println(xml);

        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<" 
                + root + ">" + xml + "</" + root + ">"); // Add the XML declaration and root element to the XML String and print it
    }
}
