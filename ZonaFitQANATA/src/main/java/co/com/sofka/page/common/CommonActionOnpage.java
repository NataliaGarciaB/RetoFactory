package co.com.sofka.page.common;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActionOnpage extends BaseSikulix{

    private WebDriver driver;
    private WebDriverWait wait;

    public CommonActionOnpage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 600);
    }

    //ACTIONS
    protected void typeInto(By locator, String value){
        driver.findElement(locator).sendKeys(value);
    }

    protected void clearText(By locator){
        driver.findElement(locator).clear();
    }

    protected void scrollTo(By locator){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView()",driver.findElement(locator));
    }

    protected void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
    }
    protected void scrollDown2(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
    }
    protected void scrollUp(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-200)");
    }
    protected void scrollUp2(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-800)");
    }

    protected  String getText (By locator){
        return driver.findElement(locator).getText();
    }

    protected void pressEnter (By locator) {
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }


    //FACTORY

    public void typeInto(WebElement webElement, String value){
        webElement.sendKeys(value);
    }

    protected void clearText(WebElement webElement){
        webElement.clear();
    }

    protected void click(WebElement webElement){
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
    }

    protected void pathFile(WebElement webElement, String path){
        webElement.sendKeys(path);
    }

    protected void pressEnter(WebElement webElement) {
        webElement.sendKeys(Keys.ENTER);
    }

    public void scrollTo(WebElement webElement){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView();", webElement);
    }

    protected  String getText (WebElement webElement){
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        System.out.println("Lo espero");
        return webElement.getText();
    }

}
