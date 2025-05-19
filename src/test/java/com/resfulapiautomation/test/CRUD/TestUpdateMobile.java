package com.resfulapiautomation.test.CRUD;

import com.resfulapiautomation.base.BaseTest;
import com.resfulapiautomation.endpoints.APIConstants;
import com.resfulapiautomation.pojos.request.Mobile;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.requestSpecification;

public class TestUpdateMobile extends BaseTest {
    @Test(groups = "qa", priority = 3)
    @Owner("Rahul")
    @Description("TC#INT1 - Step 3. Verify Updated Booking by ID")
    public void testUpdateBookingByID(ITestContext iTestContext) {
        String getId = "ff808181932badb60196e779e9c33e09";

        String basepathPUT = APIConstants.CREATE_UPDATE_OBJECTS_URL + "/" + getId;
        System.out.println(basepathPUT);

        requestSpecification.basePath(basepathPUT);

        response = RestAssured
                .given(requestSpecification)
                .when().body(payloadManager.fullUpadtePayloadAsString()).put();

        validatableResponse = response.then().log().all();
        // Validatable Assertion
        validatableResponse.statusCode(200);

        Mobile mobile = payloadManager.getResponseFromJSON(response.asString());

        assertActions.verifyStringKeyNotNull(mobile.getName());
        assertActions.verifyStringKey(mobile.getName(), "iQOO CE4");
    }
}
