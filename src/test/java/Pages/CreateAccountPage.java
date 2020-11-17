package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage extends BasePage {

    Faker faker = new Faker();
    String email = faker.internet().emailAddress();

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }


    public CreateAccountPage InsertEmail(){
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email_create")).sendKeys(email);

        return this;
    }

    public AccFormPage btnCreate(){

        WebElement btn = By.id("SubmitCreate").findElement(driver);
        btn.click();

        return new AccFormPage(driver);
    }

}
