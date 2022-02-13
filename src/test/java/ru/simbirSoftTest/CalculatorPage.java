package ru.simbirSoftTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    public WebDriver driver;

    public CalculatorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@jsname='bkEvMb']")
    private WebElement zero;

    @FindBy(xpath = "//*[@jsname='N10B9']")
    private WebElement one;

    @FindBy(xpath = "//*[@jsname='lVjWed']")
    private WebElement two;

    @FindBy(xpath = "//*[@jsname='KN1kY']")
    private WebElement three;

    @FindBy(xpath = "//*[@jsname='xAP7E']")
    private WebElement four;

    @FindBy(xpath = "//*[@jsname='Ax5wH']")
    private WebElement five;

    @FindBy(xpath = "//*[@jsname='abcgof']")
    private WebElement six;

    @FindBy(xpath = "//*[@jsname='rk7bOd']")
    private WebElement seven;

    @FindBy(xpath = "//*[@jsname='T7PMFe']")
    private WebElement eight;

    @FindBy(xpath = "//*[@jsname='XoxYJ']")
    private WebElement nine;

    @FindBy(xpath = "//*[@jsname='YrdHyf']")
    private WebElement dot;

    @FindBy(xpath = "//*[@jsname='Pt8tGc']")
    private WebElement equal;

    @FindBy(xpath = "//*[@jsname='XSr6wc']")
    private WebElement plus;

    @FindBy(xpath = "//*[@jsname='pPHzQc']")
    private WebElement minus;

    @FindBy(xpath = "//*[@jsname='YovRWb']")
    private WebElement multiply;

    @FindBy(xpath = "//*[@jsname='WxTTNd']")
    private WebElement division;

    @FindBy(xpath = "//*[@jsname='F0gbu']")
    private WebElement percent;

    @FindBy(xpath = "//*[@jsname='qCp9A']")
    private WebElement closingBracket;

    @FindBy(xpath = "//*[@jsname='j93WEe']")
    private WebElement openBracket;

    @FindBy(xpath = "//*[@jsname='aN1RFf']")
    private WebElement sin;

    @FindBy(xpath = "//*[@jsname='ubtiRe']")
    private WebElement textField;

    @FindBy(xpath = "//*[@jsname='VssY5c']")
    private WebElement result;


    public String readTextField() {
        return textField.getText();
    }

    public String readResult() {
        return result.getText();
    }

    public void clickZero() {
        zero.click();
    }

    public void clickOne() {
        one.click();
    }

    public void clickTwo() {
        two.click();
    }

    public void clickThree() {
        three.click();
    }

    public void clickFour() {
        four.click();
    }

    public void clickFive() {
        five.click();
    }

    public void clickSix() {
        six.click();
    }

    public void clickSeven() {
        seven.click();
    }

    public void clickEight() {
        eight.click();
    }

    public void clickNine() {
        nine.click();
    }

    public void clickDot() {
        dot.click();
    }

    public void clickEqual() {
        equal.click();
    }

    public void clickPlus() {
        plus.click();
    }

    public void clickMinus() {
        minus.click();
    }

    public void clickMultiply() {
        multiply.click();
    }

    public void clickDivision() {
        division.click();
    }

    public void clickPercent() {
        percent.click();
    }

    public void clickClosingBracket() {
        closingBracket.click();
    }

    public void clickOpenBracket() {
        openBracket.click();
    }

    public void clickSin() {
        sin.click();
    }


    public void parsingInputExpression(String mathExpression) {

        for (int i = 0; i < mathExpression.length(); i++) {
            char a = mathExpression.charAt(i);

            switch (a) {
                case '0':
                    clickZero();
                    break;
                case '1':
                    clickOne();
                    break;
                case '2':
                    clickTwo();
                    break;
                case '3':
                    clickThree();
                    break;
                case '4':
                    clickFour();
                    break;
                case '5':
                    clickFive();
                    break;
                case '6':
                    clickSix();
                    break;
                case '7':
                    clickSeven();
                    break;
                case '8':
                    clickEight();
                    break;
                case '9':
                    clickNine();
                    break;
                case '=':
                    clickEqual();
                    break;
                case '+':
                    clickPlus();
                    break;
                case '-':
                    clickMinus();
                    break;
                case '*':
                    clickMultiply();
                    break;
                case '×':
                    clickMultiply();
                    break;
                case '/':
                    clickDivision();
                    break;
                case '÷':
                    clickDivision();
                    break;
                case '(':
                    clickOpenBracket();
                    break;
                case ')':
                    clickClosingBracket();
                    break;

            }
        }
    }
}
