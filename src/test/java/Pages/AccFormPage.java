package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccFormPage extends BasePage {
    public AccFormPage(WebDriver driver) {
        super(driver);
    }

    Faker faker = new Faker();
    String firstName = faker.name().firstName();  String lastName = faker.name().lastName();  String company = faker.company().industry();
    String address1 = faker.address().streetAddress(); String address2 = faker.address().streetAddress(); String city = faker.address().city();
    String other = faker.rickAndMorty().character(); String number  = faker.phoneNumber().cellPhone();

    public AccFormPage FillForm(){
         driver.findElement(By.id("uniform-id_gender2")).click();
         driver.findElement(By.id("customer_firstname")).sendKeys(firstName);
         driver.findElement(By.id("customer_lastname")).sendKeys(lastName);
         driver.findElement(By.id("passwd")).sendKeys("akae123!");

         //day
         driver.findElement(By.id("uniform-days")).click();
         driver.findElement(By.xpath("//*[@id=\"days\"]/option[4]")).click();

         //month
        driver.findElement(By.id("uniform-months")).click();
        driver.findElement(By.xpath("//*[@id=\"months\"]/option[5]")).click();

        //year
        driver.findElement(By.id("uniform-years")).click();
        driver.findElement(By.xpath("//*[@id=\"years\"]/option[14]")).click();

        driver.findElement(By.id("company")).sendKeys(company);
        driver.findElement(By.id("address1")).sendKeys(address1);
        driver.findElement(By.id("address2")).sendKeys(address2);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("uniform-id_state")).click();
        driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[4]")).click();
        driver.findElement(By.id("postcode")).sendKeys("00000");

        driver.findElement(By.id("other")).sendKeys(other);
        driver.findElement(By.id("phone")).sendKeys(number);
        driver.findElement(By.id("phone_mobile")).sendKeys(number);


        return this;

    }


    public MyAccount btnRegister(){
        driver.findElement(By.id("submitAccount")).click();

        return new MyAccount(driver);
    }




}
