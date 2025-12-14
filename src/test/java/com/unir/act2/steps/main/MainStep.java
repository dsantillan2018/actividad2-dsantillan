package com.unir.act2.steps.main;

import net.serenitybdd.annotations.Step;
import com.unir.act2.pages.main.MainPage;
import org.fluentlenium.core.annotation.Page;

public class MainStep {
    @Page
    private MainPage mainPage;

    @Step("Ingresar al portal")
    public void enterPortal() {
        mainPage.btnEnter.click(); // Acceso directo al botón
    }
}
