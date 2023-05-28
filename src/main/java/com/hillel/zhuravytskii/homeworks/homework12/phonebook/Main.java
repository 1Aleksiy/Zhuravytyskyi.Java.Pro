package com.hillel.zhuravytskii.homeworks.homework12.phonebook;

import java.util.List;

public class Main { public static void main(String[] args) {
    Phonebook phonebook = new Phonebook();


    Record record1 = new Record("Ket", "0963584252");
    Record record2 = new Record("Don", "6776573210");
    Record record3 = new Record("Sveta", "9572240010");
    Record record4 = new Record("Sam", "9876543210");
    Record record5 = new Record("Den", "9816443910");
    Record record6 = new Record("Leon", "9576500210");
    Record record7 = new Record("Don", "0356582541");
    phonebook.add(record1);
    phonebook.add(record2);
    phonebook.add(record3);
    phonebook.add(record4);
    phonebook.add(record5);
    phonebook.add(record6);
    phonebook.add(record7);


    String name = "Den";
    Record foundRecord = phonebook.find(name);
    if (foundRecord != null) {
        System.out.println("Record found: " + foundRecord.getName() + ", " + foundRecord.getPhone());
    } else {
        System.out.println("Record not found for name: " + name);
    }

    String nameToFind = "Don";
    List<Record> foundRecords = phonebook.findAll(nameToFind);
    if (foundRecords != null) {
        System.out.println("Records found for name: " + nameToFind);
        for (Record record : foundRecords) {
            System.out.println(record.getName() + ", " + record.getPhone());
        }
    } else {
        System.out.println("No records found for name: " + nameToFind);
    }
}
}

