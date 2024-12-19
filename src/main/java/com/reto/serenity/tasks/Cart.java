package com.reto.serenity.tasks;

import com.reto.serenity.userinterfaces.OpenCartPageUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Cart implements Task {

    public static Performable actuar() {
        return instrumented(Cart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OpenCartPageUI.CART, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(OpenCartPageUI.CART),
                WaitUntil.the(OpenCartPageUI.VIEWCART, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(OpenCartPageUI.VIEWCART)
        );
    }
}
