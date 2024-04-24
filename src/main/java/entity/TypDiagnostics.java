package entity;

public class TypDiagnostics {
    private int numberDiagnostics;
    private String typDiagnostics;
    private double price;

    public TypDiagnostics(int numberDiagnostics, String typDiagnostics, int price) {
        this.numberDiagnostics = numberDiagnostics;
        this.typDiagnostics = typDiagnostics;
        this.price = price;
    }

    public int getNumberDiagnostics() {
        return numberDiagnostics;
    }

    public String getTypDiagnostics() {
        return typDiagnostics;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TypDiagnostics{" +
                "numberDiagnostics=" + this.numberDiagnostics +
                ", typDiagnostics='" + this.typDiagnostics + '\'' +
                ", price=" + this.price +
                '}';
    }
}
