package co.com.sura.acelerador.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutFormUI {

    public static final Target CONTINUEDETAILS = Target.the("CONTINUEDETAILS").locatedBy("//*[@id=\"button-guest\"]");

    public static final Target FIRSTNAME = Target.the("FirstName").locatedBy("//*[@id=\"input-payment-firstname\"]");
    public static final Target LASTNAME = Target.the("LastName").locatedBy("//*[@id=\"input-payment-lastname\"]");
    public static final Target EMAIL = Target.the("Email").locatedBy("//*[@id=\"input-payment-email\"]");
    public static final Target TELEFONO = Target.the("Telefono").locatedBy("//*[@id=\"input-payment-telephone\"]");
    public static final Target COMPANY = Target.the("Company").locatedBy("//*[@id=\"input-payment-company\"]");
    public static final Target ADDRESS = Target.the("Address").locatedBy("//*[@id=\"input-payment-address-1\"]");
    public static final Target CITY = Target.the("City").locatedBy("//*[@id=\"input-payment-city\"]");
    public static final Target POSTCODE = Target.the("PostCode").locatedBy("//*[@id=\"input-payment-postcode\"]");
    public static final Target COUNTRY = Target.the("Country").locatedBy("//*[@id=\"input-payment-country\"]");
    public static final Target REGION = Target.the("Region").locatedBy("//*[@id=\"input-payment-zone\"]");

    public static final Target CONTINUEMETHOD = Target.the("CONTINUEMETHOD").locatedBy("//*[@id=\"button-shipping-method\"]");
    public static final Target CONTINUEPAYMENT = Target.the("CONTINUEPAYMENT").locatedBy("//*[@id=\"button-payment-method\"]");
    public static final Target CHECKTERMS = Target.the("CHECKTERMS").locatedBy("//*[@id=\"collapse-payment-method\"]/div/div[3]/div/input[1]");

    public static final Target CONTINUEORDER = Target.the("CONTINUEORDER").locatedBy("//*[@id=\"button-confirm\"]");
    public static final Target SUCCESSVALIDACION = Target.the("SUCCESSVALIDACION").locatedBy("//*[@id=\"common-success\"]/ul/li[4]/a");

    public static final Target MENSAJECONFIRMACION = Target.the("MENSAJECONFIRMACION").locatedBy("//*[@id=\"content\"]/h1");
}