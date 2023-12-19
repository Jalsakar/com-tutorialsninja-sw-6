package com.tutorialsninja.demo.browserfactory;

import com.tutorialsninja.demo.propertyreader.PropertyReader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ManageBrowser {
    private static final Logger log = LogManager.getLogger(ManageBrowser.class.getName());

    public static WebDriver driver;
    static String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");
    static int implicitlyWait = Integer.parseInt(PropertyReader.getInstance().getProperty("implicitlyWait"));

    public ManageBrowser() {
        PageFactory.initElements(driver, this);
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/resources/propertiesfiles/log4j2.properties");
    }

    public void selectBrowser(String browser){
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
            log.info("Launching Chrome Browser.....");
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
            log.info("Launching FireFox Browser.....");
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
            log.info("Launching Edge Browser.....");
        } else {
            log.info("Wrong browser name......");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
        driver.get(baseUrl);
    }

    public void closeBrowser(){
        if (driver!= null){
            driver.quit();
        }
    }
}
