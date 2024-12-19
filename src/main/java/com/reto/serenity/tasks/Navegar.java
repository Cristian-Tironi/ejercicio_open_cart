package com.reto.serenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


import static com.reto.serenity.util.Constantes.OPEN_CART_ABSTRACTA_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegar implements Task {

    private String url;

    public Navegar(String url) {
        this.url = url;
    }

    public static Performable WebCarritoCompra() {
        return instrumented(Navegar.class, OPEN_CART_ABSTRACTA_URL);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}
