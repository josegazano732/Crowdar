package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.RegistroUsuarioService;
import lippia.web.services.RegistroResultService;

public class RegistroSteps extends PageSteps {

    @Given("El cliente se encuentra en la seccion de registro")
    public void home() {
        RegistroUsuarioService.navegarWeb();
    }

    @When("^ Ingresa email y password (.*)$")
    public void search(String criteria) {
        RegistroUsuarioService.enterSearchCriteria(criteria);
        RegistroUsuarioService.clickSearchButton();
    }

    @Then("The client verify that results are shown properly")
    public void statVerfication() {
        RegistroResultService.verifyResults();

    }

}
