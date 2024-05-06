package repository;

import entity.RepairWorks;

import java.util.*;
import java.util.stream.Collectors;

public class RepairWorksRepository implements CrudObject<Integer, RepairWorks> {

    private Map<Integer, RepairWorks> repairWorksMap;


    public RepairWorksRepository() {
        repairWorksMap = new HashMap<>();
    }

    @Override
    public void add(RepairWorks value) {
        repairWorksMap.put(value.getNumberRepairWorks(), value);
    }

    @Override
    public boolean delete(Integer key) {
        repairWorksMap.remove(key);
        return false;
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
                new RepairWorks(
                        1,
                        "Change the engine oil;",
                        "Common maintenance", 2, 150),

                new RepairWorks(2,
                        "Replace the oil filter;",
                        "Common maintenance", 3, 300),

                new RepairWorks(3,
                        "Replace the air filter;",
                        "Common maintenance", 1, 120),

                new RepairWorks(4,
                        "Replace the cabin or a/c filter;",
                        "Common maintenance", 1, 100),

                new RepairWorks(5,
                        "Replace the spark plugs;",
                        "Common maintenance", 2, 150),

                new RepairWorks(6,
                        "Check level and refill brake fluid/clutch fluid;",
                        "Common maintenance", 1, 200),

                new RepairWorks(7,
                        "Check Brake pads/Liners, Brake discs/Drums, and replace if worn out;",
                        "Common maintenance", 2, 200),

                new RepairWorks(8,
                        "Engine repair;",
                        "Types of locksmith work", 1, 100),

                new RepairWorks(9,
                        "Manual transmission repair;",
                        "Types of locksmith work", 1, 140),

                new RepairWorks(10,
                        "Chassis repair;",
                        "Types of locksmith work", 1, 125),

                new RepairWorks(11,
                        "Repair of electrical equipment;",
                        "Types of locksmith work", 2, 300),

                new RepairWorks(12,
                        "Refilling/repairing air conditioners;",
                        "Types of locksmith work", 3, 360),

                new RepairWorks(13,
                        "Exhaust system diagnostics;",
                        "Types of locksmith work", 2, 260),

                new RepairWorks( 14,
                        "Repair of starters and generators;",
                        "Types of locksmith work",1,200),

                new RepairWorks(15,
                        "Diagnostics of attachments;",
                        "Types of locksmith work",2,400),

                new RepairWorks( 16,
                        "Replacing the timing belt;",
                        "Types of locksmith work",3,430),

                new RepairWorks(17,
                        "Chip tuning;",
                        "Types of locksmith work",3,400),

                new RepairWorks(18,
                        "Tire fitting and wheel balancing;",
                        "Types of locksmith work",2,300),

                new RepairWorks(19,
                        "Car camber/toe;",
                        "Types of locksmith work",4,500),

                new RepairWorks(20,
                        "Remove the catalyst;",
                        "Types of locksmith work",1, 200),

                new RepairWorks(21,
                        "Adjusting headlights, in particular adjusting fog lights;",
                        "Electrical and electronics work",1,200),

                new RepairWorks(22,
                        "Ignition switch repair;",
                        "Electrical and electronics work",2,200),

                new RepairWorks(23,
                        "Airbag repair;",
                        "Electrical and electronics work",2,300),

                new RepairWorks( 24,
                        "Replacing wiring;",
                        "Electrical and electronics work",2,300),

                new RepairWorks(25,
                        "Repair of starter, engine sensors, brake system;",
                        "Electrical and electronics work",3,400),

                new RepairWorks(26,
                        "Troubleshooting air conditioning, furnace or climate control problems;",
                        "Electrical and electronics work",1,150),

                new RepairWorks(27,
                        "Installation and repair of car alarms;",
                        "Electrical and electronics work",2,250),

                new RepairWorks(28,
                        "Repair of parking sensors, on-board computer;",
                        "Electrical and electronics work",2,300),

                new RepairWorks(29,
                        "Installation of headlights, players;",
                        "Electrical and electronics work",6, 100)));

        repairWorksMap = repairWorks.stream().collect(Collectors.toMap(p -> p.getNumberRepairWorks(), p -> p));
    }
}
