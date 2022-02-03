package pages;


import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$;

public class SideBarMenu {

    public void logOut(){
        $(".text-danger").click();
        WebDriverRunner.url().contains("https://qauto.forstudy.space/");
    }
}
