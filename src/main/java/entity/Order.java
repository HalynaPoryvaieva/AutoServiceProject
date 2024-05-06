package entity;

import java.util.List;
import java.util.Map;

public class Order {

    private int id;
    private Map<Integer, List<TypDiagnostics>> typDiagnostics;
    private Map<Integer, List<RepairWorks>> repairWorks;
    private Payment payment;
    private DateIntake dateIntake;
    private DateOfCompleted dateOfCompleted;
    private Map<Integer, List<Car>> clientCarsMap;
    private static int idCounter = 0;

    public Order(int id, Map<Integer, List<TypDiagnostics>> typDiagnostics, Map<Integer, List<RepairWorks>> repairWorks, Payment payment, DateIntake dateIntake, DateOfCompleted dateOfCompleted, Map<Integer, List<Car>> clientCarsMap) {
        this.id = ++idCounter;
        this.typDiagnostics = typDiagnostics;
        this.repairWorks = repairWorks;
        this.payment = payment;
        this.dateIntake = dateIntake;
        this.dateOfCompleted = dateOfCompleted;
        this.clientCarsMap = clientCarsMap;
    }

    public void addTypDiagnostics(Integer id, List<TypDiagnostics> diagnostics) {
        typDiagnostics.put(id, diagnostics);
    }

    public void deleteTypDiagnostics(Integer id) {
        typDiagnostics.remove(id);
    }

    public void addRepairWorks(Integer id,List<RepairWorks>works) {
        repairWorks.put(id, works);
    }

    public void deleteRepairWorks(Integer id) {
        repairWorks.remove(id);
    }

    public void addPayment(Payment payment) {
        this.payment = payment;
    }

    public void deletePayment() {
        this.payment = null;
    }

    public void addDateIntake(DateIntake dateIntake) {
        this.dateIntake = dateIntake;
    }

    public void deleteDateIntake() {
        this.dateIntake = null;
    }

    public void addDateOfCompleted(DateOfCompleted dateOfCompleted) {
        this.dateOfCompleted = dateOfCompleted;
    }

    public void deleteDateOfCompleted() {
        this.dateOfCompleted = null;
    }

    public void addClientCarsMap(Integer clientId, List<Car> cars) {
        clientCarsMap.put(clientId, cars);
    }

    public void deleteClientCarsMap(Integer clientId) {
        clientCarsMap.remove(clientId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Integer, List<TypDiagnostics>> getTypDiagnostics() {
        return typDiagnostics;
    }

    public void setTypDiagnostics(Map<Integer, List<TypDiagnostics>> typDiagnostics) {
        this.typDiagnostics = typDiagnostics;
    }

    public Map<Integer, List<RepairWorks>> getRepairWorks() {
        return repairWorks;
    }

    public void setRepairWorks(Map<Integer, List<RepairWorks>> repairWorks) {
        this.repairWorks = repairWorks;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public DateIntake getDateIntake() {
        return dateIntake;
    }

    public void setDateIntake(DateIntake dateIntake) {
        this.dateIntake = dateIntake;
    }

    public DateOfCompleted getDateOfCompleted() {
        return dateOfCompleted;
    }

    public void setDateOfCompleted(DateOfCompleted dateOfCompleted) {
        this.dateOfCompleted = dateOfCompleted;
    }

    public Map<Integer, List<Car>> getClientCarsMap() {
        return clientCarsMap;
    }

    public void setClientCarsMap(Map<Integer, List<Car>> clientCarsMap) {
        this.clientCarsMap = clientCarsMap;
    }

    public void addTypDiagnostics(TypDiagnostics typDiagnostics) {

    }

    public void addRepairWorks(List<RepairWorks> works) {

    }

    private class DateIntake {
    }

    private class DateOfCompleted {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", typDiagnostics=" + typDiagnostics +
                ", repairWorks=" + repairWorks +
                ", payment=" + payment +
                ", dateIntake=" + dateIntake +
                ", dateOfCompleted=" + dateOfCompleted +
                ", clientCarsMap=" + clientCarsMap +
                '}';
    }
}