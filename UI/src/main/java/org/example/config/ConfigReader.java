package org.example.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {
        try{
            String path = "D:\\SummerSDET2023\\UI\\src\\main\\resources\\config.properties";
            FileInputStream inputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
        }catch (IOException e ){
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key).trim();
    }

    public static void main(String[] args) {
        System.out.println(getProperty("name"));
    }

}
