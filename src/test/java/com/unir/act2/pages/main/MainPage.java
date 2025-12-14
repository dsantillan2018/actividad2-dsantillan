package com.unir.act2.pages.main;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MainPage extends PageObject {
    @FindBy(id = "btn_enter")
    public WebElementFacade btnEnter;
}
