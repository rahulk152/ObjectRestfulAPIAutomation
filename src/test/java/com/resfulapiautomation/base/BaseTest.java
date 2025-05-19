package com.resfulapiautomation.base;

import com.resfulapiautomation.asserts.AssertActions;
import com.resfulapiautomation.endpoints.APIConstants;
import com.resfulapiautomation.modules.PayloadManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

   public RequestSpecification requestSpecification;
   public AssertActions assertActions;
   public PayloadManager payloadManager;
   public JsonPath jsonPath;
   public Response response;
   public ValidatableResponse validatableResponse;

    @BeforeTest
    public void setup() {
        System.out.println("Starting of the Test");
        payloadManager = new PayloadManager();
        assertActions = new AssertActions();

        //requestSpecification = RestAssured.given();
        //requestSpecification.baseUri(APIConstants.BASE_URL);
        //requestSpecification.contentType(ContentType.JSON).log().all();

        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(APIConstants.BASE_URL).addHeader("Content-Type", "Application/Json")
                .build().log().all();

    }

    @AfterTest
    public void tearDown() {

        System.out.println("Finished the Test!");
    }
}
