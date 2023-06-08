package com.hillel.zhuravytskii.homeworks.homework9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileMaxSizeReachedException, FileNotFoundException, IOException
    {
        FileLoggerConfiguration config = new FileLoggerConfigurationLoader().load("logger-config.txt");

        Logger fileLogger = new FileLogger(config);
        Logger fakeLogger = new FakeLogger(config);

        Stream.generate(() -> "a")
                .limit(1000)
                        .peek(v -> {
                            fileLogger.debug("current iteration is %s".formatted(v));
                         //   fakeLogger.debug("it is a fake logger: current iteration is %s".formatted(v));

                            fileLogger.info("this is INFO  %s".formatted(v));
                            fakeLogger.info("it is a fake logger: current iteration is %s".formatted(v));
                        })
                .sorted()
                        .collect(Collectors.toList());

        fileLogger.close();
        fakeLogger.close();
    }

}
