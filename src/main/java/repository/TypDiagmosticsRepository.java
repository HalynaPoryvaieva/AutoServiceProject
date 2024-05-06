package repository;

import entity.TypDiagnostics;

import java.util.*;
import java.util.stream.Collectors;

public class TypDiagmosticsRepository implements CrudObject<Integer, TypDiagnostics> {

    private Map<Integer, TypDiagnostics> typDiagnosticsMap;

    public TypDiagmosticsRepository() {
        typDiagnosticsMap = new HashMap<>();
    }

    @Override
    public void add(TypDiagnostics value) {
        typDiagnosticsMap.put(value.getNumberDiagnostics(), value);
    }

    @Override
    public boolean delete(Integer key) {
        typDiagnosticsMap.remove(key);
        return false;
    }

    @Override
    public TypDiagnostics get(Integer key) {
        return typDiagnosticsMap.get(key);
    }

    @Override
    public Collection<TypDiagnostics> findAll() {
        return typDiagnosticsMap.values();
    }

    //TODO
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

        // typDiagnostic.forEach(d -> typDiagnosticsMap.put(d.getNumberDiagnostics(),d));
        typDiagnosticsMap = typDiagnostic.stream().collect(Collectors.toMap(p -> p.getNumberDiagnostics(), p -> p));

    }
    public TypDiagnostics get(int numberDiagnostics){
        return  typDiagnosticsMap.get(numberDiagnostics);
    }

}
