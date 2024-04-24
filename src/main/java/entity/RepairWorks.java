package entity;

public class RepairWorks {
    private int numberRepairWorks;
    private String typRepairWorks;
    private double timeExecution;
    private double price;
    private static int numberRepairWorksCount=0;

    public RepairWorks(int numberRepairWorks, String typRepairWorks, int timeExecution, double price) {
        this.numberRepairWorks = ++numberRepairWorks;
        this.typRepairWorks = typRepairWorks;
        this.timeExecution = timeExecution;
        this.price = price;
    }

    public int getNumberRepairWorks() {
        return numberRepairWorks;
    }

    public String getTypRepairWorks() {
        return typRepairWorks;
    }

    public double getTimeExecution() {
        return timeExecution;
    }

    public double getPrice() {
        return price;
    }

    public void setNumberRepairWorks(int numberRepairWorks) {
        this.numberRepairWorks = numberRepairWorks;
    }

    public void setTypRepairWorks(String typRepairWorks) {
        this.typRepairWorks = typRepairWorks;
    }

    public void setTimeExecution(double timeExecution) {
        this.timeExecution = timeExecution;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RepairWorks{" +
                "numberRepairWorks=" + this.numberRepairWorks +
                ", typRepairWorks='" + this.typRepairWorks + '\'' +
                ", timeExecution=" + this.timeExecution +
                ", price=" + this.price +
                '}';
    }
}
