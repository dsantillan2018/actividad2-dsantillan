package com.unir.act2.pages.home;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {
    // Aquí se implementarán los métodos y atributos de la página de inicio
    @FindBy(id = "nav_appointments")
    public WebElementFacade hyperlink_appointments;
}
