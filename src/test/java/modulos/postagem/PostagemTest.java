package modulos.postagem;

import dataFactory.PostagemDataFactory;
import io.restassured.http.ContentType;
import jdk.nashorn.internal.objects.Global;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.PostagemPojo;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;


@DisplayName("Testes de API do modulo de Postagem")
public class PostagemTest {

    @BeforeEach
    public void beforeEach(){
        //Configurando dados da api
        baseURI = "https://jsonplaceholder.typicode.com";
        basePath = "/posts";

    }
    @Test
    @DisplayName("Validar dados retornados")
    public void testValidarMetodoGet(){
    given()
            .contentType(ContentType.JSON);
    when()
            .get()
    .then()
            .assertThat()
            .statusCode(200);
    }

    @Test
    @DisplayName("Validar dados retornados por id")
    public void testValidarMetodoGetID(){
        given()
                .contentType(ContentType.JSON);
        when()
                .get("?id=2")
        .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    @DisplayName("Validar status code com id nao existente")
    public void testValidarMetodoGetIDNaoExiste(){
        given()
                .contentType(ContentType.JSON);
        when()
                .get("?id=2324")
                .then()
                .assertThat()
                .statusCode(404);
    }

    @Test
    @DisplayName("Validar status code ao alterar o medoto")
    public void testValidarAlteracaoMetodo(){
        given()
                .contentType(ContentType.JSON);
        when()
                .put()
                .then()
                .assertThat()
                .statusCode(405);
    }

    @Test
    @DisplayName("Validar se a postagem foi adicionada com o id correto")
    public void testValidarPostagemAdicionada(){
        given()
                .contentType(ContentType.JSON)
                .body(PostagemDataFactory.criarPostagemValida())
        .when()
                .post()
        .then()
                .assertThat()
                .body("id", equalTo("444"))
                .statusCode(201);
    }

    @Test
    @DisplayName("Validar status code para dados incorretos")
    public void testValidarEnvioDadosErrados(){
        given()
                .contentType(ContentType.JSON)
                .body("{  \n" +
                        "        \"userId\": 123,\n" +
                        "        \"id\": 444,\n" +
                        "        \"title\": teste hildo,\n" +
                        "        \"body\": \"teste xpto\"\n" +
                        " }")
        .when()
                .post()
        .then()
                .assertThat()
                .statusCode(404);
    }

    @Test
    @DisplayName("Validar status code para dados enviados usando put")
    public void testValidarEnvioDadosPut(){
        given()
                .contentType(ContentType.JSON)
                .body(PostagemDataFactory.criarPostagemValida())
        .when()
                .post()
        .then()
                .assertThat()
                .statusCode(405);
    }

    @Test
    @DisplayName("Validar status code para body vazio usando post")
    public void testValidarEnvioSemDados(){
        given()
                .contentType(ContentType.JSON)
                .body("")
        .when()
                .post()
        .then()
                .assertThat()
                .statusCode(400);
    }


}
