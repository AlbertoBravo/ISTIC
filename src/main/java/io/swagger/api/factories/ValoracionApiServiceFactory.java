package io.swagger.api.factories;

import io.swagger.api.ValoracionApiService;
import io.swagger.api.impl.ValoracionApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-26T00:15:19.972Z[GMT]")
public class ValoracionApiServiceFactory {
    private final static ValoracionApiService service = new ValoracionApiServiceImpl();

    public static ValoracionApiService getValoracionApi() {
        return service;
    }
}
