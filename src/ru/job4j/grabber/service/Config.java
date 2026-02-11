package ru.job4j.grabber.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private final Properties properties = new Properties();

    public void load(String file) {
        try (InputStream input = Config.class.getClassLoader().getResourceAsStream(file)) {
            if (input == null) {
                throw new IllegalArgumentException("File not found: " + file);
            }
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String get(String key) {
        return properties.getProperty(key);
    }
}
