package com.example.loading.tasks1C.task1;

import com.example.loading.tasks1C.task1.Equipment;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Equipment> equipmentList;

    public Inventory() {
        equipmentList = new ArrayList<>();
    }

    public void addEquipment(Equipment equipment) {
        equipmentList.add(equipment);
    }

    public void removeEquipment(Equipment equipment) {
        equipmentList.remove(equipment);
    }

    public List<Equipment> getExpiredEquipment(int currentUsagePeriod) {
        List<Equipment> expiredEquipment = new ArrayList<>();

        for (Equipment equipment : equipmentList) {
            if (equipment.getUsagePeriod() >= currentUsagePeriod ||
                    equipment.getExpirationPeriod() <= currentUsagePeriod) {
                expiredEquipment.add(equipment);
            }
        }

        return expiredEquipment;
    }
}
