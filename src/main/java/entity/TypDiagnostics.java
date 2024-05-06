package entity;

public class TypDiagnostics {
    private int numberDiagnostics;
    private String typDiagnostics;

    private double priceTypDiagnostics;
    private static int numberDiagnosticsCount=0;

    public TypDiagnostics(int numberDiagnostics, String typDiagnostics, double priceTypDiagnostics) {
        this.numberDiagnostics = ++numberDiagnostics;
        this.typDiagnostics = typDiagnostics;
        this.priceTypDiagnostics = priceTypDiagnostics;
    }

    public int getNumberDiagnostics() {
        return numberDiagnostics;
    }

    public String getTypDiagnostics() {
        return typDiagnostics;
    }

    public double getPriceTypDiagnostics() {
        return priceTypDiagnostics;
    }

    public void setNumberDiagnostics(int numberDiagnostics) {
        this.numberDiagnostics = numberDiagnostics;
    }

    public void setTypDiagnostics(String typDiagnostics) {
        this.typDiagnostics = typDiagnostics;
    }

    public void setPrice(double price) {
        this.priceTypDiagnostics = priceTypDiagnostics;
    }

    @Override
    public String toString() {
        return "TypDiagnostics{" +
                "numberDiagnostics=" + this.numberDiagnostics +
                ", typDiagnostics='" + this.typDiagnostics + '\'' +
                ", price=" + this.priceTypDiagnostics +
                '}';
    }

    public void update(String typDiagnostics, double price) {
        this.typDiagnostics = typDiagnostics;
        this.priceTypDiagnostics = priceTypDiagnostics;
    }
}
