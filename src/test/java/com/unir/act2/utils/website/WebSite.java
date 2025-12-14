package com.unir.act2.utils.website;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class WebSite {
    @Steps(shared = true)
    PageObject page;

    @Step("Navegar al sitio web")
    public void navigateTo(String url) {
        page.setDefaultBaseUrl(url);
        page.open();
    }
}
