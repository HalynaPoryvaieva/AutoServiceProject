package servise;

import entity.TypDiagnostics;
import repository.TypDiagmosticsRepository;

public class TypDiagmosticsServise  {
    private TypDiagmosticsRepository repository;

    public TypDiagmosticsServise(TypDiagmosticsRepository repository) {
        this.repository = repository;
    }

    public void add(int numberDiagnostics,String typDiagnostics,double priceTypDiagnostics){
        TypDiagnostics typDiagnostics1=new TypDiagnostics(numberDiagnostics,typDiagnostics,priceTypDiagnostics);
        repository.add(typDiagnostics1);
    }

    public boolean update(int idNumberDiagnostics,String typDiagnostics,double priceTypDiagnostics){
        TypDiagnostics newTypDiagnostics = repository.get(idNumberDiagnostics);
        if (newTypDiagnostics != null) {
            newTypDiagnostics.update(typDiagnostics,priceTypDiagnostics);
            return true;
        }
        return false;
    }

    public boolean delete(int numberDiagnostics){
        TypDiagnostics delTypDiagnostics=repository.get(numberDiagnostics);
        if (delTypDiagnostics !=null){
            repository.delete(numberDiagnostics);
            return true;
        }
        return false;
    }

    public TypDiagnostics get(int numberDiagnostics){
        return  repository.get(numberDiagnostics);
    }

    public void findAll(){
        repository.findAll().forEach(System.out::println);
    }
}