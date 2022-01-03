package co.com.sofka.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUI {
    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String WEBDRIVER_CHROME_DRIVER_PATH ="src/test/resources/driver/windows/chrome/chromedriver.exe";

    private static final String RETO2_QA_URL = "https://zonafit.co/";

    protected WebDriver driver;

    private void setUpWebdriver(){
        System.setProperty(WEBDRIVER_CHROME_DRIVER,WEBDRIVER_CHROME_DRIVER_PATH);
    }

    private void setUpWebdriverUrl(){
        driver = new ChromeDriver();
        driver.get(RETO2_QA_URL);
    }

    protected void generalSetup(){
        setUpWebdriver();
        setUpWebdriverUrl();
        driver.manage().window().maximize();
    }
    protected void quiteDriver(){
        driver.quit();
    }


}



