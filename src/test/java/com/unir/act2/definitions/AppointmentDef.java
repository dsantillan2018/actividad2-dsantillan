package com.unir.act2.definitions;

import com.unir.act2.steps.appointment.AppointmentStep;
import com.unir.act2.steps.home.HomeStep;
import com.unir.act2.steps.main.MainStep;
import com.unir.act2.steps.validations.ValidationStep;
import com.unir.act2.utils.website.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class AppointmentDef {

    @Steps(shared = true)
    MainStep mainStep;

    @Steps(shared = true)
    HomeStep homeStep;

    @Steps(shared = true)
    AppointmentStep appointmentStep;

    @Steps(shared = true)
    ValidationStep validationStep;

    @Steps(shared = true)
    WebSite webSite;

    @Given("el usuario ingresa a la aplicacion de citas medicas")
    public void userNavigatesTo() {
        webSite.navigateTo("https://actividad1-dsantillan.vercel.app");
    }

    @When("el usuario da clic en el boton ingresar")
    public void userEntersAppointmentApplication() {
        mainStep.enterPortal();
    }

    @And("el usuario navega hasta el formulario de creacion de citas medicas")
    public void navigateToAppointmentForm() {
        homeStep.navigateToAppointmentPage();
    }

    @And("el usuario ingresa los datos requeridos para la cita medica")
    public void enterRequiredAppointmentData() {
        // Valores de ejemplo; puedes parametrizar si lo deseas
        appointmentStep.selectSpecialty("Odontopediatría");
        appointmentStep.enterAppointmentDate("2025-12-31");
        appointmentStep.enterAppointmentHour("10:00");
    }

    @And("el usuario da clic en el boton de guardar cita medica")
    public void clickSaveAppointmentButton() {
        appointmentStep.clickSave();
    }

    @Then("la cita medica debe crearse correctamente")
    public void appointmentShouldBeCreatedSuccessfully() {
        boolean created = validationStep.isAppointmentCreated();
        if (!created) {
            throw new AssertionError("La cita no fue creada correctamente");
        }
    }
}
