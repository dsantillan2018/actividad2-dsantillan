package com.unir.act2.pages.appointment;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AppointmentPage extends PageObject {
    // Elemento select para tipo de cita
    @FindBy(id = "specialty")
    public WebElementFacade select_specialty;

    // Primer campo de texto
    @FindBy(id = "appointmentDate")
    public WebElementFacade txt_appointment_date;

    // Segundo campo de texto
    @FindBy(id = "appointmentTime")
    public WebElementFacade txt_appointment_time;
}
