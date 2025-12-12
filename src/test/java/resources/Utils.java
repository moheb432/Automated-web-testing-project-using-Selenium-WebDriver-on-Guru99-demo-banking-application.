package resources;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
public class Utils extends TestContext {
    static WebDriver dRiver;
    public static WebDriver driver;
    public static WebDriverWait wait;
    public Utils() throws IOException {
    }

    public static WebDriver setup_Driver(String Driver) throws IOException {
        WebDriver dRiver;
        switch (Driver) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                WebDriver chromedriver = new ChromeDriver();
                chromedriver.manage().window().maximize();
                chromedriver.get(Utils.Get_GlobalData("BASE_URI"));
                chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
                return chromedriver;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                WebDriver firefoxdriver = new FirefoxDriver();
                firefoxdriver.manage().window().maximize();
                firefoxdriver.get(Utils.Get_GlobalData("BASE_URI"));
                firefoxdriver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
                return firefoxdriver;

            case "safari":
                WebDriverManager.safaridriver().setup();
                WebDriver Safaridriver = new SafariDriver();
                Safaridriver.manage().window().maximize();
                Safaridriver.get(Utils.Get_GlobalData("BASE_URI"));
                Safaridriver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
                return Safaridriver;
            default:
                WebDriverManager.safaridriver().setup();
                dRiver = new SafariDriver();

        }
        return dRiver;
    }

    public static String Get_GlobalData(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/test/java/resources/Global.properties");
        prop.load(fis);
        prop.setProperty("email", prop.getProperty("email"));
        prop.setProperty("password", prop.getProperty("password"));
        prop.setProperty("BASE_URI", prop.getProperty("BASE_URI"));
        prop.setProperty("driver", prop.getProperty("driver"));

        System.out.println(prop.getProperty(key));
        return prop.getProperty(key);
    }

}



