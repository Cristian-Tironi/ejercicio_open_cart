package co.com.sura.acelerador.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OpenCartPageUI {

    public static final Target STORE = Target.the("Your Store").locatedBy("//*[@id=\"logo\"]/h1/a");

    public static final Target CART = Target.the("CART").locatedBy("//*[@id=\"cart\"]/button");
    public static final Target VIEWCART = Target.the("VIEWCART").locatedBy("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]");

    public static final Target CHECKOUT = Target.the("CHECKOUT").locatedBy("//*[@id=\"content\"]/div[3]/div[2]/a");
    public static final Target GUEST = Target.the("GUEST").locatedBy("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/input");
    public static final Target CONTINUECHECKOUT = Target.the("CONTINUECHECKOUT").locatedBy("//*[@id=\"button-account\"]");
}
