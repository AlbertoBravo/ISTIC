package io.swagger.api.factories;

import io.swagger.api.OxigenoApiService;
import io.swagger.api.impl.OxigenoApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-25T23:14:59.688Z[GMT]")
public class OxigenoApiServiceFactory {
    private final static OxigenoApiService service = new OxigenoApiServiceImpl();

    public static OxigenoApiService getOxigenoApi() {
        return service;
    }
}
