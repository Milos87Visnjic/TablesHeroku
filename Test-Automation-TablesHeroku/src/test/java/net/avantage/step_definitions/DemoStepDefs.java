package net.avantage.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.avantage.pages.DemoPage;
import net.avantage.pages.LoginPage;
import net.avantage.utils.BrowserUtils;
import org.junit.Assert;

public class DemoStepDefs {
    DemoPage demoPage = new DemoPage();
    LoginPage loginPage = new LoginPage();

    @Given("User navigates to Demo Page")
    public void user_navigates_to_demo_page() {
        demoPage.navigateToDemoPage();
    }

    @And("User scroll down to Sortable Data Tables")
    public void userScrollDownToSortableDataTables() {
        BrowserUtils.scrollToElement(demoPage.sortableDataTables);
    }

    @And("User click on Sortable Data Tables")
    public void userClickOnSortableDataTables() {
        demoPage.clickOnSortableDataTables();
    }

    @Then("User verifies Example One is displayed")
    public void userVerifiesExampleOneIsDisplayed() {
        Assert.assertTrue(demoPage.example1.isDisplayed());
    }

    @And("User verifies first table")
    public void userVerifiesFirstTable() {
        demoPage.validateTable();
    }

    @And("User verifies LastNames and FirstNames are in ascending order")
    public void userVerifiesLastNamesAndFirstNamesAreInAscendingOrder() {
        demoPage.validateAscendingOrder();
    }

    @And("User prints rows and column numbers")
    public void userPrintsRowsAndColumnNumbers() {
        demoPage.printRowsNumbers();
        demoPage.printColumnNumber();
    }

    @And("User prints second row and third column")
    public void userPrintsSecondRowAndThirdColumn() {
        demoPage.printSecondRow();
        demoPage.printThirdColumn();
    }
}
