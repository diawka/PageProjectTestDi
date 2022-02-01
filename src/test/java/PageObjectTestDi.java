import org.junit.Test;
import pages.GaragePage;
import pages.HomePage;


public class PageObjectTestDi {

    @Test
    public void canLogin(){


        HomePage homePage= new HomePage();

        GaragePage garagePage = homePage.login ("didyalife69@gmail.com",  "KK288071as");


         garagePage.notifications.shouldHaveText("You have been successfully logged in");

    }

    @Test
    public void canLogOutViaHeader(){
        HomePage homePage= new HomePage();
        GaragePage garagePage = homePage.login ("didyalife69@gmail.com",  "KK288071as");
        garagePage.logOutByHeaderMenu();
    }

    @Test
    public void canLogOutViaSidebar(){
        HomePage homePage= new HomePage();
        GaragePage garagePage = homePage.login ("didyalife69@gmail.com",  "KK288071as");
        garagePage.logOutBySideBar();
    }
}
