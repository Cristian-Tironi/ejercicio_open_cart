package co.com.sura.acelerador.stepdefinitions;

import co.com.sura.acelerador.model.FormData;
import co.com.sura.acelerador.questions.MainPage;
import co.com.sura.acelerador.questions.MensajeConfirmacion;
import co.com.sura.acelerador.tasks.*;

import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.*;

import org.hamcrest.CoreMatchers;
import net.serenitybdd.screenplay.actors.*;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static co.com.sura.acelerador.util.Constantes.USUARIO;

public class FlujoCompraStepDefinition {

    @DataTableType
    public FormData convert(Map<String, String> object){
        FormData obj = new FormData();

        obj.setFirstName(object.get("FirstName"));
        obj.setLastName(object.get("LastName"));
        obj.setEmail(object.get("Email"));
        obj.setTelefono(object.get("Telefono"));
        obj.setCompany(object.get("Company"));
        obj.setAddress(object.get("Address"));
        obj.setCity(object.get("City"));
        obj.setPostCode(object.get("PostCode"));
        obj.setCountry(object.get("Country"));
        obj.setRegion(object.get("Region"));

        return obj;
    }

    @Before
    public void setUpStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("usuario ingreso a la URL de opencart abstracta")
    public void usuarioIngresoALaURLDeOpencartAbstracta() {
        theActorCalled(USUARIO).wasAbleTo(
                Navegar.WebCarritoCompra()
        );
        theActorInTheSpotlight().should(seeThat(MainPage.displayed(), CoreMatchers.equalTo("Your Store")));
    }

    @When("agrega {int} al carrito")
    public void agregaAlCarrito(Integer cantidad) {
        theActorInTheSpotlight().remember("cantidad", cantidad);
        theActorInTheSpotlight().attemptsTo(new AddItem());
    }

    @And("visualiza el carrito")
    public void visualizaElCarrito() {
        theActorInTheSpotlight().attemptsTo(
                Cart.actuar()
        );
    }

    @And("completar el checkout como invitado")
    public void completarElCheckoutComoInvitado(FormData formData) {
        theActorInTheSpotlight().attemptsTo(
                RellenarForm.datos(formData)
        );
    }

    @Then("finaliza la compra")
    public void finalizaLaCompra() {
        theActorInTheSpotlight().attemptsTo(
                Finalizar.actuar()
        );
    }

    @And("visualizo la confirmación: {string}")
    public void visualizoLaConfirmaciónYourOrderHasBeenPlaced(String validacion) {
        theActorInTheSpotlight().should(
                seeThat(MensajeConfirmacion.displayed(), equalTo(validacion))
        );
    }
}
