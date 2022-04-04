package starter.tugasAlta;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    @Given("user is in Login Page")
    public void userIsInLoginPage() {
        System.out.println("User in Login Page");
    }

    @And("user input email")
    public void userInputEmail() {
        System.out.println("Email filled");
    }

    @And("user input password")
    public void userInputPassword() {
        System.out.println("Password filled");
    }

    @When("user click on Login Button")
    public void userClickOnLoginButton() {
        System.out.println("Login button clicked");
    }

    @Then("user is directed to Profile page")
    public void userIsDirectedToProfilePage() {
        System.out.println("Login successfully, redirected to Profile page");
    }

    @Then("user should see a warning")
    public void userShouldSeeAWarning() {
        System.out.println("Login failed!");
    }
}
