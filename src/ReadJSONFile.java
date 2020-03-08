import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ReadJSONFile {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("myJSON.json");
            JSONObject jsonObject = (JSONObject)obj;
            String name = (String) jsonObject.get("name");
            System.out.println("Name is: " + name);

            String location = (String) jsonObject.get("location");
            System.out.println("Location is: " + location);

            //loop array
            JSONArray coursesArray = (JSONArray)jsonObject.get("courses");

            for (String s : (Iterable<String>) coursesArray) {
                System.out.println("Course: " + s);
            }
        }
        catch(FileNotFoundException e) { e.printStackTrace(); }
    }
}
