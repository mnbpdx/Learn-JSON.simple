import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;

public class readJSONJobs {
    public static void main(String[] vars) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("jobs.json"));

            JSONArray jobs = (JSONArray)obj;

            Iterator<JSONObject> iterator = jobs.iterator();

            while(iterator.hasNext()) {
                System.out.println(iterator.next().get("task"));
            }



        }
        catch(Exception e) { e.printStackTrace(); }
    }
}
