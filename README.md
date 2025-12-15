# actividad2-dsantillan

Proyecto de automatización de pruebas usando Serenity BDD + Cucumber + Selenium.

## Resumen

Este repositorio contiene una suite de pruebas de aceptación (BDD) para la validación de la creación de una cita médica. Las pruebas están escritas en Gherkin (Cucumber) y se ejecutan con Serenity BDD que orquesta Selenium WebDriver para interactuar con el navegador y genera reportes detallados.

## Estructura relevante

- `pom.xml` - configuración Maven y dependencias.
- `src/test/resources/features/` - features en Gherkin (.feature).
- `src/test/java/com/unir/act2/definitions/` - definiciones (glue) de Cucumber.
- `src/test/java/com/unir/act2/steps/` - clases Step de Serenity.
- `src/test/java/com/unir/act2/pages/` - PageObjects (WebElementFacade).
- `src/test/java/com/unir/act2/Runner.java` - clase runner que inicia Cucumber con Serenity.

## Requisitos

- Java 21 (JDK instalado y `JAVA_HOME` configurado).
- Maven 3.6+.
- Chrome instalado en el sistema y (opcional) ChromeDriver compatible. Se recomienda usar WebDriverManager o un Selenium Grid/Docker para evitar problemas de versiones de driver.

## Cómo ejecutar las pruebas

Desde la raíz del proyecto ejecuta:

```bash
mvn -U -DskipTests=false test
```

Esto compilará el proyecto, descargará dependencias y lanzará el runner de Serenity/Cucumber.

### Generar reporte HTML

Desde la raíz del proyecto ejecuta:

```bash
mvn serenity:aggregate
```

Esto generará un reporte HTML con todos los resultados de las pruebas.

