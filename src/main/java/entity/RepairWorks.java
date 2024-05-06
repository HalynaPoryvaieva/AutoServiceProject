package entity;

public class RepairWorks {
    private int numberRepairWorks;
    private String typRepairWorks;
    private String groupRepairWorks;
    private double timeExecution;
    private double priceRepairWorks;
    private static int numberRepairWorksCount=0;

    public RepairWorks(int numberRepairWorks, String typRepairWorks, String groupRepairWorks, double timeExecution, double priceRepairWorks) {
        this.numberRepairWorks = numberRepairWorks;
        this.typRepairWorks = typRepairWorks;
        this.groupRepairWorks = groupRepairWorks;
        this.timeExecution = timeExecution;
        this.priceRepairWorks = priceRepairWorks;
    }

    public int getNumberRepairWorks() {
        return numberRepairWorks;
    }

    public String getTypRepairWorks() {
        return typRepairWorks;
    }

    public String getGroupRepairWorks() {
        return groupRepairWorks;
    }

    public double getTimeExecution() {
        return timeExecution;
    }

    public double getPrice() {
        return priceRepairWorks;
    }

    public void setNumberRepairWorks(int numberRepairWorks) {
        this.numberRepairWorks = numberRepairWorks;
    }

    public void setTypRepairWorks(String typRepairWorks) {
        this.typRepairWorks = typRepairWorks;
    }

    public void setGroupRepairWorks(String groupRepairWorks) {
        this.groupRepairWorks = groupRepairWorks;
    }

    public void setTimeExecution(double timeExecution) {
        this.timeExecution = timeExecution;
    }

    public void setPrice(double price) {
        this.priceRepairWorks = price;
    }

    @Override
    public String toString() {
        return "RepairWorks{" +
                "numberRepairWorks=" + this.numberRepairWorks +
                ", typRepairWorks='" + this.typRepairWorks + '\'' +
                ", groupRepairWorks='" + this.groupRepairWorks + '\'' +
                ", timeExecution=" + this.timeExecution +
                ", price=" + this.priceRepairWorks +
                '}';
    }
}
