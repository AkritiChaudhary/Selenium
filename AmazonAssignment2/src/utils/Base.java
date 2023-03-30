package src.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties prop;


    public WebDriver init_driver() {
        init_property();
        String dl = prop.getProperty("driverLocation");
        String browserName = prop.getProperty("browser");
        String url = prop.getProperty("url");
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", dl);
            driver = new ChromeDriver();
        }
        driver.navigate().to(url);
        return driver;
    }

    public Properties init_property() {
        prop = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("/home/akritd/IdeaProjects/AmazonAssignment/AmazonAssignment2/src/config.properties");
            prop.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
    }
}
