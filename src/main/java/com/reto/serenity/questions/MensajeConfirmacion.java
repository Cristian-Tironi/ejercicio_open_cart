package com.reto.serenity.questions;

import com.reto.serenity.userinterfaces.CheckoutFormUI;

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
