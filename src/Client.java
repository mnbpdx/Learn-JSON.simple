public class Client {
    public static void main(String[] args) {
        JobSchedule schedule = new JobSchedule("jobs.json");
        schedule.print();
    }
}
