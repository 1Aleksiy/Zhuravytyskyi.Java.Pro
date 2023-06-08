package com.hillel.zhuravytskii.homeworks.homework9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileLoggerConfigurationLoader {
    public FileLoggerConfiguration load(String filePath) {
        Path fPath = Path.of(filePath);
        if (!fPath.toFile().exists()) {
            throw new IllegalArgumentException("File path is wrong.");
        }

        try {
            List<String> lines = Files.readAllLines(fPath);
            return getLoggerConfiguration(lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static FileLoggerConfiguration getLoggerConfiguration(List<String> lines) {
        FileLoggerConfiguration config = new FileLoggerConfiguration();
        for (String line : lines) {
            String[] arr = line.split(":");
            String key = arr[0];
            String value = arr[1];

            if (arr.length > 2) {
                value += ":" + arr[2];
            }

            switch (key) {
                case "FILE":
                    config.setFilePath(value);
                    break;
                case "LEVEL":
                    config.setLevel(LoggerLevel.valueOf(value.strip().toUpperCase()));
                    break;
                case "MAX-SIZE":
                    config.setMaxFileSize(Integer.parseInt(value.strip()));
                    break;
                case "FORMAT":
                    config.setFormat(value);
                    break;
                default:
                    //case "": text
                    throw new RuntimeException("NO DATA AVAILABLE.");
            }
        }
        return config;
    }
}
