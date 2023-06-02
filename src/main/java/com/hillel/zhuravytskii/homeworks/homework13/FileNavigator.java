package com.hillel.zhuravytskii.homeworks.homework13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FileNavigator {
    private Map<String, List<FileData>> fileMap;

    public FileNavigator() {
        fileMap = new HashMap<>();
    }

    public void add(FileData fileData) {
        String path = fileData.getPath();
        if (fileMap.containsKey(path)) {
            List<FileData> fileList = fileMap.get(path);
            fileList.add(fileData);
        } else {
            List<FileData> fileList = new ArrayList<>();
            fileList.add(fileData);
            fileMap.put(path, fileList);
        }
    }

    public List<FileData> find(String path) {
        return fileMap.getOrDefault(path, new ArrayList<>());
    }

    public List<FileData> filterBySize(long maxSize) {
        List<FileData> filteredList = new ArrayList<>();
        for (List<FileData> fileList : fileMap.values()) {
            for (FileData fileData : fileList) {
                if (fileData.getSize() <= maxSize) {
                    filteredList.add(fileData);
                }
            }
        }
        return filteredList;
    }

    public void remove(String path) {
        fileMap.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> sortedList = new ArrayList<>();
        for (List<FileData> fileList : fileMap.values()) {
            sortedList.addAll(fileList);
        }
        return sortedList;
    }

    public void checkConsistency(FileData fileData) {
        String path = fileData.getPath();
        String key = null;
        for (String existingPath : fileMap.keySet()) {
            if (path.startsWith(existingPath)) {
                key = existingPath;
                break;
            }
        }
        if (key == null || !key.equals(path)) {
            System.out.println("Inconsistent file path");
        }
    }
}
