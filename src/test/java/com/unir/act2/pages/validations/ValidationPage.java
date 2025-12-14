package com.unir.act2.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject {
    @FindBy(id = "success_toast")
    public WebElementFacade success_toast;
}

