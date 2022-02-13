package ru.simbirSoftTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    public WebDriver driver;

    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        driver.get("https://www.google.com");
    }

    @FindBy(xpath = "//*[@jsaction='paste:puy29d;']")
    private WebElement input;

    @FindBy(className = "gNO89b")
    private WebElement searchButton;

    public void inputFill() {
        input.sendKeys("Калькулятор");
    }

    public void clickSearchButton() {
        searchButton.click();
    }

}
