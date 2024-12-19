package com.reto.serenity.stepdefinitions;

import com.reto.serenity.tasks.*;
import com.reto.serenity.model.FormData;
import com.reto.serenity.questions.MainPage;
import com.reto.serenity.questions.MensajeConfirmacion;

import io.cucumber.java.en.*;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;

import java.util.Map;
import org.hamcrest.CoreMatchers;
import net.serenitybdd.screenplay.actors.*;

import static org.hamcrest.CoreMatchers.containsString;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static com.reto.serenity.util.Constantes.USUARIO;
import static com.reto.serenity.util.Constantes.MENSAJE_TITULO_HOME_YOUR_STORE;

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
        theActorInTheSpotlight().should(
                seeThat("Validación de que se carga correctamente la página y muestra el titulo",
                        MainPage.displayed(), CoreMatchers.equalTo(MENSAJE_TITULO_HOME_YOUR_STORE)));
    }

    @When("agrega {int} al carrito")
    public void agregaAlCarrito(Integer cantidad) {
        theActorInTheSpotlight().attemptsTo(
                AddItem.add(cantidad)
        );
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
                seeThat(MensajeConfirmacion.displayed(), containsString(validacion))
        );
    }
}
