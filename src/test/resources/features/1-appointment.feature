@Suite @Appointment
Feature: UNIRCP01 - Validar creacion de una cita medica

  Background: Validar la creacion de una cita medica mediante un formulario
    Given el usuario ingresa a la aplicacion de citas medicas

    @Creation
    Scenario: 1 - Creacion exitosa de una cita medica
        When el usuario da clic en el boton ingresar
        And el usuario navega hasta el formulario de creacion de citas medicas
        And el usuario ingresa los datos requeridos para la cita medica
        And el usuario da clic en el boton de guardar cita medica
        Then la cita medica debe crearse correctamente

