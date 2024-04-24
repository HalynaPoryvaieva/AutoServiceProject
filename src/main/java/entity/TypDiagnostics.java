package entity;

public class TypDiagnostics {
    private int numberDiagnostics;
    private String typDiagnostics;
    private double price;
    private static int numberDiagnosticsCount=0;

    public TypDiagnostics(int numberDiagnostics, String typDiagnostics, double price) {
        this.numberDiagnostics = ++numberDiagnostics;
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

    public void setNumberDiagnostics(int numberDiagnostics) {
        this.numberDiagnostics = numberDiagnostics;
    }

    public void setTypDiagnostics(String typDiagnostics) {
        this.typDiagnostics = typDiagnostics;
    }

    public void setPrice(double price) {
        this.price = price;
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
