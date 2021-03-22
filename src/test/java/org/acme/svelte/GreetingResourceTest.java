package org.acme.svelte;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.endsWith;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        String name = "fred";
        given()
          .when().get("/hello/"+name)
          .then()
             .statusCode(200)
             .body(endsWith(" "+name));
    }

}