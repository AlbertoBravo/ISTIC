package io.swagger.api.impl;

import com.google.gson.Gson;
import io.swagger.api.*;
import io.swagger.model.*;


import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-24T18:52:21.602Z[GMT]")

public class GraficaApiServiceImpl extends GraficaApiService {


    List <Usuario> usuarios;
    Mediciones mediciones;

    public GraficaApiServiceImpl () {

        usuarios = new ArrayList<Usuario>();
        Usuario usuario1 = new Usuario("U1","Alberto","Bravo Gomez"
                ,"alberto@email.com","87654321","Trujillo");
        Medicion medicion1 = new Medicion ("M1","U1","23/12/2018---11:23:24"
                ,56,123,8);
        Medicion medicion2 = new Medicion ("M2","U1","23/12/2018---11:23:25"
                ,76,113,7);
        Medicion medicion3 = new Medicion ("M3","U1","23/12/2018---11:23:35"
                ,36,53,3);

        Usuario usuario2 = new Usuario("U2","Roberto","Zato Perdido"
                ,"roberto@email.com","87653321","Trujillanos");

        Usuario usuario3 = new Usuario("U3","Rodrigo","Arresto Seguro"
                ,"rodrigo@email.com","87153321","Almendralejo");

        usuarios.add(usuario1);

        usuarios.add(usuario2);

        mediciones.add(medicion1);

        mediciones.add(medicion2);

        mediciones.add(medicion3);

    }


    @Override
    public Response obtenerGrafica( @NotNull String usuarioId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!


        Mediciones mediciones = new Mediciones();

        for (int i = 0; i < mediciones.size(); i++) {

            if (mediciones.get(i).getUsuarioId().equalsIgnoreCase(usuarioId)){

                mediciones.add(mediciones.get(i));

            }

        }

        Gson gson = new Gson();

        // 1. Java object to JSON, and save into a file
        // gson.toJson(obj, new FileWriter("D:\\file.json"));

        // 2. Java object to JSON, and assign to a String
        String jsonInString = gson.toJson(mediciones);

        return Response.ok(jsonInString, MediaType.APPLICATION_JSON).build();


    }

}

