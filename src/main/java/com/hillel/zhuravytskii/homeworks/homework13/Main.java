package com.hillel.zhuravytskii.homeworks.homework13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileNavigator navigator = new FileNavigator();

        FileData file1 = new FileData("Asd1.txt", 100, "C:/Users/Алексей/IdeaProjects/Zhuravytyskyi.Java.Pro/src/main/java/com/hillel/zhuravytskii/homeworks/homework13");
        FileData file2 = new FileData("Asd2.txt", 200, "C:/Users/Алексей/IdeaProjects/Zhuravytyskyi.Java.Pro/src/main/java/com/hillel/zhuravytskii/homeworks/homework13");
        FileData file3 = new FileData("Asd3.txt", 300, "C:/Users/Алексей/IdeaProjects/Zhuravytyskyi.Java.Pro/src/main/java/com/hillel/zhuravytskii/homeworks/homework13");

        navigator.add(file1);
        navigator.add(file2);
        navigator.add(file3);


        String path = "C:/Users/Алексей/IdeaProjects/Zhuravytyskyi.Java.Pro/src/main/java/com/hillel/zhuravytskii/homeworks/homework13/Asd";
        List<FileData> foundFiles = navigator.find(path);
        System.out.println("Files found at path " + path + ":");
        for (FileData file : foundFiles) {
            System.out.println(file.getName());
        }

        long maxSize = 250;
        List<FileData> filteredFiles = navigator.filterBySize(maxSize);
        System.out.println("Files with size less than or equal to " + maxSize + ":");
        for (FileData file : filteredFiles) {
            System.out.println(file.getName());
        }

        navigator.remove("C:/Users/Алексей/IdeaProjects/Zhuravytyskyi.Java.Pro/logger-config.txt");

        List<FileData> sortedFiles = navigator.sortBySize();
        System.out.println("Files sorted by size:");
        for (FileData file : sortedFiles) {
            System.out.println(file.getName() + " - " + file.getSize() + " bytes");
        }

        FileData inconsistentFile = new FileData("file4.txt", 400, "/another/path/");
        navigator.checkConsistency(inconsistentFile);
    }
}

