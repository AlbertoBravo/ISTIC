package io.swagger.api.factories;

import io.swagger.api.GraficaApiService;
import io.swagger.api.impl.GraficaApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-25T23:14:59.688Z[GMT]")
public class GraficaApiServiceFactory {
    private final static GraficaApiService service = new GraficaApiServiceImpl();

    public static GraficaApiService getGraficaApi() {
        return service;
    }
}
