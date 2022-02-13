package ru.simbirSoftTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.naming.ldap.StartTlsRequest;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static WebDriver driver;
    public static CalculatorPage calculatorPage;

    public void parsingInputExpression(String mathExpression){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asya\\.m2\\repository\\webdriver\\chromedriver\\win32\\98.0.4758.80\\chromedriver.exe");
        driver = new ChromeDriver();
        calculatorPage = new CalculatorPage(driver);

        String[] array = mathExpression.split("");

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("1")){
                calculatorPage.clickOne();
            }
        }


        for (String a:array
             ) {
            System.out.println(a);
//            System.out.println("+");
        }

    }
}
