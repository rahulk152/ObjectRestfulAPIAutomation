package com.resfulapiautomation.test.CRUD;

import com.resfulapiautomation.base.BaseTest;
import com.resfulapiautomation.endpoints.APIConstants;
import com.resfulapiautomation.pojos.response.ResponseMobile;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestGetMobile extends BaseTest {
    @Owner("Rahul")
    @Description("TC1# - Setp 2. Verify that Mobile")
    @Test(groups = "qa" , priority = 1)
    public void testCreateMobile(ITestContext iTestContext){
        String getId = "ff808181932badb60196e779e9c33e09";

        String baseGetPath = APIConstants.CREATE_UPDATE_OBJECTS_URL + "/" + getId;
        // Setup and Making a Request.
        requestSpecification.basePath(baseGetPath);
        response = RestAssured.given(requestSpecification).when().get();

        // Extraction
        validatableResponse = response.then().log().all();
        // Validatable Assertion
        validatableResponse.statusCode(200);

    }
}
