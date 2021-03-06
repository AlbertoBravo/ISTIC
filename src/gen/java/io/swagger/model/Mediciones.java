/*
 * API Tratamiento
 * API que se encargue del tratamiento gráfico de los datos procesados en función de lo que solicite el usuario gráficas, valoración, etc.
 *
 * OpenAPI spec version: 1.0
 * Contact: albravog@alumnos.unex.es
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;


import java.util.Objects;


import io.swagger.model.Medicion;
import java.util.ArrayList;
import java.util.List;



import javax.validation.constraints.*;




/**
 * Mediciones
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-24T18:52:21.602Z[GMT]")
public class Mediciones extends ArrayList<Medicion>  {




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mediciones {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}



