package com.epam.reportportal.automation.core.configuration;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class Configuration {

    private static final String CONFIG_FILE = "test.properties";
    private static final Properties properties = new Properties();

    static {
        try (InputStream input = Configuration.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (input == null) {
                System.err.println("Unable to load " + CONFIG_FILE);
                //return null;
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}