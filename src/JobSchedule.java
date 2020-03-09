import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class JobSchedule {
    private ArrayList<Job> jobArray;

    JobSchedule(String fileName) {
        Gson g = new Gson();
        try {
            jobArray = g.fromJson(new FileReader(fileName), new TypeToken<ArrayList<Job>>(){}.getType());
        }
        catch (FileNotFoundException e) { e.printStackTrace(); }
    }

    public void print() {
        for (Job job: jobArray) {
            System.out.println("Job: " + job.getTask());
            System.out.println("Mileage: " + job.getMileage());
            System.out.println();
        }
    }
}


