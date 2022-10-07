package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.RegistroUsuarioService;
import lippia.web.services.RegistroResultService;

public class RegistroSteps extends PageSteps {

    @Given("El cliente se encuentra en la seccion de registro")
    public void home() {
        RegistroUsuarioService.navegarWeb();
        RegistroUsuarioService.clickMiCuenta();
    }

    @When("^ Ingresa email <email> y password <password> (.*)$")
    public void search(String criteria) {
        RegistroUsuarioService.enterEmailCriteria(criteria);
        RegistroUsuarioService.clickSearchButton();
    }

    @Then("Accedemos a pagina principal")
    public void statVerfication() {
        RegistroResultService.verifyResults();

    }



}
