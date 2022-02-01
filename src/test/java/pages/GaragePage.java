package pages;

public class GaragePage extends BasePage{
    SideBarMenu sideBarMenu;
    HeaderMenu headerMenu;

    public GaragePage(){
        sideBarMenu = new SideBarMenu();
        headerMenu = new HeaderMenu();
    }

    public void logOutBySideBar(){
        sideBarMenu.logOut();
    }

    public void logOutByHeaderMenu(){
        headerMenu.logOut();
    }
}
