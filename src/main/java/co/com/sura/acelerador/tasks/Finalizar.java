package co.com.sura.acelerador.tasks;

import co.com.sura.acelerador.userinterfaces.CheckoutFormUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Finalizar implements Task {

    public static Performable actuar() {
        return instrumented(Finalizar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckoutFormUI.CONTINUEORDER,isClickable()).forNoMoreThan(20).seconds(),
                Click.on(CheckoutFormUI.CONTINUEORDER),
                WaitUntil.the(CheckoutFormUI.SUCCESSVALIDACION,isClickable()).forNoMoreThan(20).seconds()
        );
    }
}
