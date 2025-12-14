package com.unir.act2.steps.validations;

import com.unir.act2.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ValidationStep {
    @Page
    ValidationPage validationPage;

    @Step("Validar creacion de la cita")
    public boolean isAppointmentCreated() {
        // Devuelve true si el elemento success_toast está visible, false si no lo está
        return validationPage.success_toast.isDisplayed();
    }
}
