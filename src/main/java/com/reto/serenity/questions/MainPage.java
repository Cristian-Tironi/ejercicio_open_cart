package com.reto.serenity.questions;

import com.reto.serenity.userinterfaces.OpenCartPageUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MainPage implements Question {

    public static Question<String> displayed() {
        return new MainPage();
    }
    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(OpenCartPageUI.STORE,isVisible()).forNoMoreThan(10).seconds();
        return Text.of(OpenCartPageUI.STORE).answeredBy(actor);
    }
}