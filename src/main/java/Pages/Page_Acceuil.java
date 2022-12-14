package main.java.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_Acceuil {
    WebDriver driver;

    public Page_Acceuil(WebDriver driver) {
        this.driver = driver;
    }

    public void saisirlogin(String val1){
        WebElement champsLogin=driver.findElement(By.id("user-name"));
        champsLogin.sendKeys(val1);
    }
    public void saisirMdp(String val2){
        WebElement champsMdp=driver.findElement(By.id("password"));
        champsMdp.sendKeys(val2);
    }
    public void cliquerBoutonLogin(){
        WebElement BtnLogin=driver.findElement(By.id("login-button"));
        BtnLogin.click();
    }

    public  void affichertxt(){
        WebElement Text = driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3"));
        String Xsite = Text.getText();
        String Xcorrecte = "Epic sadface: Username and password do not match any user in this service";

        if (Xsite.equals(Xcorrecte)) {
            System.out.println("CORRECT");

        } else{

            System.out.println("INCORRECT");

        }
    }
}
