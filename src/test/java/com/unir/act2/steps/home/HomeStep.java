package com.unir.act2.steps.home;

import net.serenitybdd.annotations.Step;
import com.unir.act2.pages.home.HomePage;
import org.fluentlenium.core.annotation.Page;

public class HomeStep {
    @Page
    private HomePage homePage;

    @Step("Navegar a la creacion de citas")
    public void navigateToAppointmentPage() {
        homePage.hyperlink_appointments.click();
    }
}

