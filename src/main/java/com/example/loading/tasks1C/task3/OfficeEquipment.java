package com.example.loading.tasks1C.task3;

import java.util.ArrayList;
import java.util.List;

// Создать класс для оргтехники
public class OfficeEquipment {

    private String name;
    private String model;
    private String serialNumber;

    // конструктор, геттеры и сеттеры

    public OfficeEquipment(String name, String model, String serialNumber) {
        this.name = name;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

// Класс для сотрудников
class Employee {
    private String name;
    private List<Employee> children;

    // конструктор, геттеры и сеттеры

    public Employee(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getChildren() {
        return children;
    }

    public void setChildren(List<Employee> children) {
        this.children = children;
    }
}

// Класс для помещений
class Room {
    private String name;
    private List<OfficeEquipment> equipmentList;

    // конструктор, геттеры и сеттеры

    public Room(String name) {
        this.name = name;
        equipmentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OfficeEquipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<OfficeEquipment> equipmentList) {
        this.equipmentList = equipmentList;
    }
}

// Класс для перемещения оргтехники
class EquipmentMove {
    private Employee employee;
    private Room room;
    private OfficeEquipment equipment;

    // конструктор, геттеры и сеттеры

    public EquipmentMove(Employee employee, Room room, OfficeEquipment equipment) {
        this.employee = employee;
        this.room = room;
        this.equipment = equipment;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public OfficeEquipment getEquipment() {
        return equipment;
    }

    public void setEquipment(OfficeEquipment equipment) {
        this.equipment = equipment;
    }
}

// Класс для закрепления оргтехники за сотрудником
class EquipmentAssignment {
    private Employee mol;
    private Employee oi;
    private Room room;
    private OfficeEquipment equipment;

    // конструктор, геттеры и сеттеры

    public EquipmentAssignment(Employee mol, Employee oi, Room room, OfficeEquipment equipment) {
        this.mol = mol;
        this.oi = oi;
        this.room = room;
        this.equipment = equipment;
    }

    public Employee getMol() {
        return mol;
    }

    public void setMol(Employee mol) {
        this.mol = mol;
    }

    public Employee getOi() {
        return oi;
    }

    public void setOi(Employee oi) {
        this.oi = oi;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public OfficeEquipment getEquipment() {
        return equipment;
    }

    public void setEquipment(OfficeEquipment equipment) {
        this.equipment = equipment;
    }
}

// Отчет
class Report {
    public void generateReport(List<OfficeEquipment> equipmentList, List<Room> rooms, String equipmentName, String roomName) {
        for (OfficeEquipment equipment : equipmentList) {
            if (equipment.getName().equals(equipmentName)) {
                for (Room room : rooms) {
                    if (room.getName().equals(roomName)) {
                        if (room.getEquipmentList().contains(equipment)) {
                            System.out.println("Equipment: " + equipment.getName() + ", Model: " + equipment.getModel() +
                                    ", Serial Number: " + equipment.getSerialNumber() + ", Room");

                        }
                    }
                }
            }
        }
    }
}
