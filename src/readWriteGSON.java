import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class readWriteGSON {
    public static void main(String[] args) {
        Gson g = new Gson();
        try {
            Job[] jobs = g.fromJson(new FileReader("jobs.json"), Job[].class);
            for (Job job : jobs) {
                System.out.println("Job: " + job.getTask());
                System.out.println("Mileage: " + job.getMileage());
                System.out.println();
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}