package com.reto.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OpenCartPageUI {

    public static final Target STORE = Target.the("Título de la página que dice Your Store").located(By.id("logo"));

    public static final Target ITEM = Target.the("Botón Add to Cart").located(By.xpath("//span[text()='Add to Cart']"));

    public static final Target CART = Target.the("Botón del carrito de compra").located(By.id("cart"));
    public static final Target VIEWCART = Target.the("Botón View Cart dentro del popup del carrito de compra").located(By.xpath("//strong[text()=' View Cart']"));

    public static final Target CHECKOUT = Target.the("Botón de Checkout dentro del carrito de compra").located(By.xpath("//a[text()='Checkout']"));
    public static final Target GUEST = Target.the("Botón de Guest para el checkout").located(By.xpath("//input[@value='guest']"));
    public static final Target CONTINUECHECKOUT = Target.the("Botón de Continue dentro del form de checkout").located(By.id("button-account"));
}
