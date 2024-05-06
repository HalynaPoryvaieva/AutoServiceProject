package servise;

import entity.RepairWorks;
import repository.RepairWorksRepository;

public class RepairWorksServise {
    private RepairWorksRepository repository;

    public RepairWorksServise(RepairWorksRepository repository) {
        this.repository = repository;
    }

    public void add(int numberRepairWorks, String typRepairWorks, String groupRepairWorks, double timeExecution, double priceRepairWorks) {
        RepairWorks repairWorksNew = new RepairWorks(numberRepairWorks, typRepairWorks, groupRepairWorks, timeExecution, priceRepairWorks);
        repository.add(repairWorksNew);
    }

    public boolean delete(int numberRepairWorks) {
        RepairWorks delRepairWorks = repository.get(numberRepairWorks);
        if (delRepairWorks != null) {
            repository.delete(numberRepairWorks);
            return true;
        }
        return false;

    }

    public RepairWorks get(int numberRepairWorks) {
        return repository.get(numberRepairWorks);
    }

    public void findAll() {
        repository.findAll().forEach(System.out::println);
    }
}
