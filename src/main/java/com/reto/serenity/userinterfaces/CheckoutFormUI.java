package com.reto.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutFormUI {

    public static final Target CONTINUEDETAILS = Target.the("Botón Continue a detalles en formulario de checkout como guest").located(By.id("button-guest"));

    public static final Target FIRSTNAME = Target.the("Input de FirstName en el formulario de checkout").located(By.id("input-payment-firstname"));
    public static final Target LASTNAME = Target.the("Input de LastName en el formulario de checkout").located(By.id("input-payment-lastname"));
    public static final Target EMAIL = Target.the("Input de Email en el formulario de checkout").located(By.id("input-payment-email"));
    public static final Target TELEFONO = Target.the("Input de Telefono en el formulario de checkout").located(By.id("input-payment-telephone"));
    public static final Target COMPANY = Target.the("Input de Company en el formulario de checkout").located(By.id("input-payment-company"));
    public static final Target ADDRESS = Target.the("Input de Address en el formulario de checkout").located(By.id("input-payment-address-1"));
    public static final Target CITY = Target.the("Input de City en el formulario de checkout").located(By.id("input-payment-city"));
    public static final Target POSTCODE = Target.the("Input de PostCode en el formulario de checkout").located(By.id("input-payment-postcode"));
    public static final Target COUNTRY = Target.the("Input de Country en el formulario de checkout").located(By.id("input-payment-country"));
    public static final Target REGION = Target.the("Input de Region en el formulario de checkout").located(By.id("input-payment-zone"));

    public static final Target CHECKTERMS = Target.the("Input de checkout para los términos y condiciones del formulario").located(By.xpath("//input[@name='agree']"));
    public static final Target CONTINUEPAYMENT = Target.the("Botón de continue una vez seleccionado marcado el input de términos y condiciones").located(By.id("button-payment-method"));

    public static final Target CONTINUEORDER = Target.the("Botón de Confirm Order para finalizar el checkout").located(By.id("button-confirm"));

    public static final Target SUCCESSVALIDACION = Target.the("Div que contiene los elementos confirmando la orden").located(By.id("common-success"));
    public static final Target MENSAJECONFIRMACION = Target.the("Div que contiene el título confirmando la orden").located(By.id("content"));
}