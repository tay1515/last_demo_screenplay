package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.tasks.LoginTask;
import starter.tasks.NavigateTo;
import starter.utils.GeneralEnvironment;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStep {

    @Given("Inicio en la pagina")
    public void InicioEnLaPagina() {
        String environment = GeneralEnvironment.environmentVariables("environments.default.webdriver.base.url");
        theActorCalled("Andres").attemptsTo(NavigateTo.openPage(environment));
    }

    @When("intento iniciar sesion con las credenciales")
    public void intentoIniciarSesionConLasCredenciales(List<Map<String, String>> list) {
        System.out.println("user " + list.get(0).get("user") + "pass " + list.get(0).get("password"));
        withCurrentActor(LoginTask.Login(list));
    }
}
