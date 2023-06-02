package com.hillel.zhuravytskii.homeworks.homework13;

import java.io.File;

class FileData {
    private  String name;
    private  long size;
    private  String path;

    public FileData(String name, long size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }

    public boolean exists() {
        File file = new File(path);
        return file.exists();
    }
}