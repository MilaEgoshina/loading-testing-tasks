package com.example.loading.tasks1C.task1;

public class EquipmentReport {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Equipment camera = new Equipment("Кинокамера", 3, 3000, 60, 20);
        inventory.addEquipment(camera);

        Equipment lighter = new Equipment("Портсигар", 2, 400, 500, 520);
        inventory.addEquipment(lighter);

        // Проверка состояния на выбранную дату (31 января 2010 года):
        int currentUsagePeriod = 250; // Число месяцев с момента ввода в эксплуатацию

        System.out.println("Состояние оборудования в эксплуатации на 31.01.2010");
        System.out.println("Оборудование   Кол-во   Сумма     Ост ср. г.  Ост ср. эксп.");

        for (Equipment equipment : inventory.getExpiredEquipment(currentUsagePeriod)) {
            System.out.printf("%-15s %-8d %-10d %-12d %d%n",
                    equipment.getName(),
                    equipment.getQuantity(),
                    (equipment.getPrice() * equipment.getQuantity()),
                    (equipment.getExpirationPeriod() - currentUsagePeriod),
                    (equipment.getUsagePeriod() - currentUsagePeriod));
        }
    }
}
