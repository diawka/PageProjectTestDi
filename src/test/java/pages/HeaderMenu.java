package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderMenu {

    public void logOut(){
        $("app-user-nav").click();
        $(By.xpath("//button[text()='Logout']")).click();
    }
}
