package co.com.sura.acelerador.questions;

import co.com.sura.acelerador.userinterfaces.CheckoutFormUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeConfirmacion implements Question {

    public static Question<String> displayed() {
        return new MensajeConfirmacion();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(CheckoutFormUI.MENSAJECONFIRMACION).answeredBy(actor);
    }
}
