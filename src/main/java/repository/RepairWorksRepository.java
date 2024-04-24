package repository;

import entity.RepairWorks;
import java.util.*;

public class RepairWorksRepository implements RegistrationObject<Integer, RepairWorks> {

    private Map<Integer, RepairWorks> repairWorksMap;

    public RepairWorksRepository() {
        repairWorksMap = new HashMap<>();
    }


    @Override
    public void add(RepairWorks value) {
        repairWorksMap.put(value.getNumberRepairWorks(), value);
    }

//TODO
    @Override
    public void update(Integer key, RepairWorks value) {
        repairWorksMap.compute(value.getNumberRepairWorks(), (number, newRepairWorks) -> {
            if (newRepairWorks != null) {
                return value;
            } else {
                return value;
            }
        });

    }

    @Override
    public void delete(Integer key) {
        repairWorksMap.remove(key);
    }

    @Override
    public RepairWorks get(Integer key) {
        return repairWorksMap.get(key);
    }

    @Override
    public Collection<RepairWorks> findAll() {
        return repairWorksMap.values();
    }

//TODO
    public void init() {
        List<RepairWorks> repairWorks = new ArrayList<>(List.of(
                new RepairWorks(1, "Common maintenance:\n" +
                        "Change the engine oil.\n" +
                        "Replace the oil filter.\n" +
                        "Replace the air filter.\n" +
                        "Replace the fuel filter.\n" +
                        "Replace the cabin or a/c filter.\n" +
                        "Replace the spark plugs.\n" +
                        "Check level and refill brake fluid/clutch fluid.\n" +
                        "Check Brake pads/Liners, Brake discs/Drums, and replace if worn out.", 3, 200),
                new RepairWorks(2, "Types of locksmith work:\n" +
                        "Engine repair;\n" +
                        "Manual transmission repair;\n" +
                        "Chassis repair;\n" +
                        "Repair of electrical equipment;\n" +
                        "Refilling/repairing air conditioners;\n" +
                        "Exhaust system diagnostics;\n" +
                        "Repair of starters and generators;\n" +
                        "Diagnostics of attachments;\n" +
                        "Replacing the timing belt;\n" +
                        "Chip tuning;\n" +
                        "Tire fitting and wheel balancing;\n" +
                        "Car camber/toe;\n" +
                        "Remove the catalyst", 6, 200),
                new RepairWorks(3, "Electrical and electronics work:" +
                        "Adjusting headlights, in particular adjusting fog lights;\n" +
                        "Ignition switch repair;\n" +
                        "Airbag repair;\n" +
                        "Replacing wiring;\n" +
                        "Repair of starter, engine sensors, brake system;\n" +
                        "Troubleshooting air conditioning, furnace or climate control problems;\n" +
                        "Installation and repair of car alarms;\n" +
                        "Repair of parking sensors, on-board computer;\n" +
                        "Installation of headlights, players", 6, 100)));
    }
}
