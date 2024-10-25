package co.com.sura.acelerador.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AddItem implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        int cantidad = actor.recall("cantidad");
        for (int i = 0; i < cantidad; i++) {
            WebElement element = getDriver().findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]/span"));
            element.click();
        }
    }
}

