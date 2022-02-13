package ru.simbirSoftTest;

import io.qameta.allure.Step;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Tests {
    public static WebDriver driver;
    public static CalculatorPage calculatorPage;
    public static GooglePage googlePage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asya\\.m2\\repository\\webdriver\\chromedriver\\win32\\98.0.4758.80\\chromedriver.exe");
        driver = new ChromeDriver();

        calculatorPage = new CalculatorPage(driver);
        googlePage = new GooglePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void integerOperation() {
        googlePage.inputFill();
        googlePage.clickSearchButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        calculatorPage.parsingInputExpression("(1 + 2) × 3 - 40 ÷ 5 =");

        checkIntegerOperation(calculatorPage.readTextField(), calculatorPage.readResult());

//        Assert.assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", calculatorPage.readTextField());
//        Assert.assertEquals("1", calculatorPage.readResult());
    }

    @Step
    public static void checkIntegerOperation(String textField, String result)
    {
        Assert.assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", textField);
        Assert.assertEquals("1", result);
    }

    @Test
    public void divideByZero(){
        googlePage.inputFill();
        googlePage.clickSearchButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        calculatorPage.parsingInputExpression("6 ÷ 0 =");

        Assert.assertEquals("6 ÷ 0 =", calculatorPage.readTextField());
        Assert.assertEquals("Infinity", calculatorPage.readResult());
    }

    @Test
    public void errorByMissingElement(){
        googlePage.inputFill();
        googlePage.clickSearchButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        calculatorPage.clickSin();
        calculatorPage.clickEqual();

        Assert.assertEquals("sin() =", calculatorPage.readTextField());
        Assert.assertEquals("Error", calculatorPage.readResult());
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }


}
