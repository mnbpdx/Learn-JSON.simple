import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class CreateJSONFile {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("name", "Mark Beebe");
        obj.put("location", "Portland, OR");

        JSONArray list = new JSONArray();
        list.add("Java");
        list.add("JSP");
        list.add("Servlets");
        obj.put("courses", list);

        try(FileWriter file = new FileWriter("myJSON.json")) {
            file.write(obj.toString());
            file.flush();
        }
        catch(IOException e) {
            System.out.println("Problem opening the file!");
            System.out.println("Stack Trace: ");
            e.printStackTrace();
        }
        System.out.println(obj);
    }
}
