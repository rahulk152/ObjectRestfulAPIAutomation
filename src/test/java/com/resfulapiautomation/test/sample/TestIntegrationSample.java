package com.resfulapiautomation.test.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {
    // Create a object
    // Verify that Get object
    // Update the object
    // Delete the object

    @Owner("Rahul")
    @Description("TC1# - Setp 1. Verify that object can be created")
    @Test(groups = "qa" , priority = 1)
    public void testCreateObject(){
        Assert.assertTrue(true);
    }
    @Owner("Rahul")
    @Description("TC1# - Setp 2. Verify that object by ID")
    @Test(groups = "qa" , priority = 2)
    public void testVerifyObjectId(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 3)
    @Owner("Rahul")
    @Description("TC#INT1 - Step 3. Verify Updated object by ID")
    public void testUpdateobjectByID(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 4)
    @Owner("Rahul")
    @Description("TC#INT1 - Step 4. Delete the object by ID")
    public void testDeleteobjectById(){
        Assert.assertTrue(true);
    }


}
