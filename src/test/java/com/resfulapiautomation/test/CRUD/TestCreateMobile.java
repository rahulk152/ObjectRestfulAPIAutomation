package com.resfulapiautomation.test.CRUD;

import com.resfulapiautomation.base.BaseTest;
import com.resfulapiautomation.endpoints.APIConstants;
import com.resfulapiautomation.pojos.response.ResponseMobile;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateMobile extends BaseTest {
    @Owner("Rahul")
    @Description("TC1# - Setp 1. Verify that Mobile can be created")
    @Test(groups = "qa" , priority = 1)
    public void testCreateMobile(){
        // Setup and Making a Request.
        requestSpecification.basePath(APIConstants.CREATE_UPDATE_OBJECTS_URL);
        response = RestAssured.given(requestSpecification).when().body(payloadManager.createPayloadObjectAsString()).log().all();

        // Extraction
        ResponseMobile responseMobile = payloadManager.mobileResponseJava(response.asString());

        // Verification Part
        assertActions.verifyStringKeyNotNull(responseMobile.getId());
       // assertActions.verifyStringKey(responseMobile.getId().getFirstname(),"Pramod");
    }
}
