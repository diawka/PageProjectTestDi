package pages;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {

    public HomePage(){
      open(
                "https://qauto.forstudy.space/",
                "",
                "guest",
                "welcome2qauto"

                );
    }

    public GaragePage login (String email, String password){
        $(".header_signin").click();
        $("#signinEmail").sendKeys(email);
        $("#signinPassword").sendKeys(password);
        $x("//*[text()='Login']").click();
        return new GaragePage();

    }

}
