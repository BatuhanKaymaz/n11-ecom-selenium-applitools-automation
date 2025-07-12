package utils;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Secrets {
    private static final Properties properties = new Properties();

    static {
        try (FileInputStream input = new FileInputStream(".env")) {
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getEmail() {
        return properties.getProperty("email");
    }

    public static String getPassword() {
        return properties.getProperty("password");
    }
    public static String apiKey() {
        return properties.getProperty("api_key");
    }


}