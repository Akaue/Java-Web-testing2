package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount extends BasePage {
    public MyAccount(WebDriver driver) {
        super(driver);
    }

    public MyAccount ValMensagem(){
        WebElement mensagemAcc = driver.findElement(By.className("info-account"));
        String mensagem = mensagemAcc.getText();
        return this;
    }
}
