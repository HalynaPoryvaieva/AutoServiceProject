package repository;

import entity.TypDiagnostics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypDiagmosticsRepository implements RegistrationObject<Integer, TypDiagnostics> {

    private Map<Integer, TypDiagnostics> typDiagnosticsMap;

    public TypDiagmosticsRepository() {
        typDiagnosticsMap = new HashMap<>();
    }

    public void init() {
        List<TypDiagnostics> typDiagnostic = new ArrayList<>(List.of(
                new TypDiagnostics(1, "Checking the engine", 25),
                new TypDiagnostics(2, "Automatic transmission and manual transmission", 25),
                new TypDiagnostics(3, "Brake system", 15),
                new TypDiagnostics(4, "Suspension", 15),
                new TypDiagnostics(5, "Optics", 20),
                new TypDiagnostics(6, "Electrical supply", 20),
                new TypDiagnostics(7, "Security systems", 30),
                new TypDiagnostics(8, "Comprehensive diagnostics:all 7 points", 150)));

    }

    @Override
    public void add(TypDiagnostics value) {
        typDiagnosticsMap.put(value.getNumberDiagnostics(), value);
    }

    @Override
    public void update(Integer key, TypDiagnostics value) {
        typDiagnosticsMap.compute(value.getNumberDiagnostics(), (number, newTypDiagnostics) -> {
            if (newTypDiagnostics != null) {
                return value;
            } else {
                return value;
            }
        });
    }

    @Override
    public void delete(Integer key) {
        typDiagnosticsMap.remove(key);
    }

    @Override
    public TypDiagnostics get(Integer key) {
        return typDiagnosticsMap.get(key);
    }

    //TODo
    @Override
    public List<TypDiagnostics> findAll() {
        return null;
    }
}
