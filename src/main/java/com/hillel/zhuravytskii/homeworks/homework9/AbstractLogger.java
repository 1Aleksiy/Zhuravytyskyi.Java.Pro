package com.hillel.zhuravytskii.homeworks.homework9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class AbstractLogger implements Logger {
    private static final String LOG_FILE_PATTERN = "Log_%s.txt";

    private Writer writer;
    private Path currentFilePath;

    protected FileLoggerConfiguration configuration;

    public AbstractLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
    }

    public void debug(String message) {
        if (configuration.getLevel() != LoggerLevel.DEBUG) {
            return;
        }

        checkOutputStream();
        checkFileConfig();
        try {
            writer.write(getMessageFormatted(message, LoggerLevel.DEBUG));
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void closeWriter() throws IOException {
        writer.flush();
        writer.close();
        writer = null;
    }

    public void info(String message) {
        checkOutputStream();
        checkFileConfig();
        try {
            writer.write(getMessageFormatted(message, LoggerLevel.INFO));
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void checkOutputStream() {
        if (writer != null) {
            return;
        }
        try {
            Path directoryPath = Path.of(configuration.getFilePath().replace("C:", "").strip());
            if (!directoryPath.toFile().exists()) {
                Files.createDirectories(directoryPath);
            }
            currentFilePath = getCompleteFilePath(directoryPath);
            writer = new OutputStreamWriter(new FileOutputStream(currentFilePath.toFile()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void checkFileConfig() {
        if (currentFilePath == null) {
            return;
        }

        BasicFileAttributeView fileAttributesView = Files.getFileAttributeView(currentFilePath, BasicFileAttributeView.class);
        try {
            BasicFileAttributes fileAttributes = fileAttributesView.readAttributes();
            if (fileAttributes.size() >= configuration.getMaxFileSize()) { //FileMaxSizeReachedException
                closeWriter();
                checkOutputStream();
            }
        } catch ( IOException e) {
            throw new RuntimeException(e);
        }

    }

    private Path getCompleteFilePath(Path directoryPath) {
        return directoryPath.resolve(Path.of(getLogFileName())).toAbsolutePath();
    }

    private String getLogFileName() {

        return LOG_FILE_PATTERN.formatted(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy-hh-mm")));

    }

    private String getMessageFormatted(String massage, LoggerLevel loggerLevel) {
        return configuration.getFormat().formatted(LocalTime.now().format(DateTimeFormatter.ofPattern("HH-mm")), loggerLevel, massage.trim());
    }

    public void close() {
        if (writer != null) {
            writer = null;
        }
    }

}
