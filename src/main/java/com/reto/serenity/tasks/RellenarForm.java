package com.reto.serenity.tasks;

import com.reto.serenity.model.FormData;
import com.reto.serenity.userinterfaces.CheckoutFormUI;
import com.reto.serenity.userinterfaces.OpenCartPageUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.reto.serenity.userinterfaces.CheckoutFormUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RellenarForm implements Task {

    private FormData formaData;

    public RellenarForm(FormData formaData) {
        this.formaData = formaData;
    }

    public static Performable datos(FormData formaData) {
        return instrumented(RellenarForm.class, formaData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OpenCartPageUI.CHECKOUT),
                WaitUntil.the(OpenCartPageUI.GUEST,isClickable()).forNoMoreThan(20).seconds(),
                Click.on(OpenCartPageUI.GUEST),
                Click.on(OpenCartPageUI.CONTINUECHECKOUT),

                WaitUntil.the(CheckoutFormUI.CONTINUEDETAILS,isClickable()).forNoMoreThan(20).seconds(),

                Enter.theValue(formaData.getFirstName()).into(FIRSTNAME),
                Enter.theValue(formaData.getLastName()).into(LASTNAME),
                Enter.theValue(formaData.getEmail()).into(EMAIL),
                Enter.theValue(formaData.getTelefono()).into(TELEFONO),
                Enter.theValue(formaData.getCompany()).into(COMPANY),
                Enter.theValue(formaData.getAddress()).into(ADDRESS),
                Enter.theValue(formaData.getCity()).into(CITY),
                Enter.theValue(formaData.getPostCode()).into(POSTCODE),
                SelectFromOptions.byVisibleText(formaData.getCountry()).from(COUNTRY),
                SelectFromOptions.byVisibleText(formaData.getRegion()).from(REGION),

                WaitUntil.the(CheckoutFormUI.CONTINUEDETAILS,isClickable()).forNoMoreThan(20).seconds(),
                Click.on(CheckoutFormUI.CONTINUEDETAILS),

                WaitUntil.the(CheckoutFormUI.CHECKTERMS,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CheckoutFormUI.CHECKTERMS),
                Click.on(CheckoutFormUI.CONTINUEPAYMENT)
        );
    }
}
