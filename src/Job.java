public class Job {
    private String task;
    private int mileage;

    Job(String task, int mileage) {
        this.task = task;
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public String getTask() {
        return task;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
