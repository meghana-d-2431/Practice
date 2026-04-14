package jsontoxml.jsonxmlconversion;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.json.JSONObject;
import org.json.XML;

public class XmlToJsonconversion {

    public static void main(String[] args) throws Exception {

        InputStream is = XmlToJsonconversion.class
                .getClassLoader()
                .getResourceAsStream("employeexml.xml");

        if (is == null) {
            throw new RuntimeException("File not found in resources!");
        }

        String stringXml = new String(is.readAllBytes(), StandardCharsets.UTF_8);

        JSONObject json = XML.toJSONObject(stringXml);

        System.out.println(json.toString(4));
    }
}