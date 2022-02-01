package pages;


import static com.codeborne.selenide.Selenide.$;

public class SideBarMenu {

    public void logOut(){
        $(".text-danger").click();
    }
}
