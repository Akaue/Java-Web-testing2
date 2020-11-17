package Testes;

import Suporte.AccessWeb;
import Pages.CreateAccountPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateAccTest{

  private WebDriver driver;

  @BeforeTest
    public void setUp(){
       driver = AccessWeb.createChrome();

    }

   @Test
     public void testCreateAcc(){
      String txtMsg = new CreateAccountPage(driver)
              .InsertEmail()
              .btnCreate()
              .FillForm()
              .btnRegister()
              .capturaMsg();

   Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", txtMsg);

   }

}
