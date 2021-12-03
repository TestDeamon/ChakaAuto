package Signup;

import POM.*;
import Setup.SetupTest;
import org.testng.annotations.Test;

public class SignupTest extends SetupTest {
    protected Loginpage loginpage;
    protected Dashboardpage dashboardpage;
    @Test
    public void testLogin() throws InterruptedException{
        System.out.println(calculator);
        loginpage= calculator.enterSearchDetails();
        dashboardpage= loginpage.LoginDetails();
        loginpage= dashboardpage.Signout();
    }
}
