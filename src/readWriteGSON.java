import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class readWriteGSON {
    public static void main(String[] args) {
        Gson g = new Gson();
        try {
            JsonReader reader = new JsonReader(new FileReader("jobs.json"));
            Job[] jobsArray = g.fromJson(reader, Job[].class);
            for (Job entry : jobsArray) {
                System.out.println("Job: " + entry.getTask());
                System.out.println("Mileage: " + entry.getMileage());
                System.out.println();
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}