import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class ReadJSONFile {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("myJSON.json"));
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
        } catch(Exception e) { e.printStackTrace(); }


    }
}
