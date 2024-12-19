package com.reto.serenity.tasks;

import com.reto.serenity.userinterfaces.OpenCartPageUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class AddItem implements Task {

    private Integer cantidad;

    public AddItem(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < cantidad; i++) {
            actor.attemptsTo(
                    WaitUntil.the(OpenCartPageUI.ITEM, isClickable()).forNoMoreThan(20).seconds(),
                    Click.on(OpenCartPageUI.ITEM)
            );
        }
    }

    public static AddItem add(Integer cantidad) {
        return Tasks.instrumented(AddItem.class, cantidad);
    }
}

