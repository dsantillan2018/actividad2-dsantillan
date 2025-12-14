package com.unir.act2.steps.appointment;

import net.serenitybdd.annotations.Step;
import com.unir.act2.pages.appointment.AppointmentPage;
import org.fluentlenium.core.annotation.Page;

public class AppointmentStep {
    @Page
    private AppointmentPage appointmentPage;

    @Step("Seleccionar una opción en el select de especialidad")
    public void selectSpecialty(String optionText) {
        appointmentPage.select_specialty.selectByVisibleText(optionText);
    }

    @Step("Ingresar la fecha de la cita")
    public void enterAppointmentDate(String fecha) {
        appointmentPage.txt_appointment_date.sendKeys(fecha);
    }

    @Step("Ingresar la hora de la cita")
    public void enterAppointmentHour(String hora) {
        appointmentPage.txt_appointment_time.sendKeys(hora);
    }

    @Step("Pulsar guardar cita")
    public void clickSave() {
        appointmentPage.btn_schedule.click();
    }
}
