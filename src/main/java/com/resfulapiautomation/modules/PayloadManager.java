package com.resfulapiautomation.modules;

import com.google.gson.Gson;
import com.resfulapiautomation.pojos.request.Data;
import com.resfulapiautomation.pojos.request.Mobile;
import com.resfulapiautomation.pojos.response.ResponseMobile;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class PayloadManager {
    Gson gson;
    // Convert the Java Object into the JSON String to use as Payload.
    // Serialization
    public String createPayloadObjectAsString(){
        Mobile mobile = new Mobile();
        mobile.setName("one Plus Nord CE3");
        Data data = new Data();
        data.setYear(2022);
        data.setPrice(23456.99);
        data.setCPUModel("SnapDragon");
        data.setHardDiskSize("512 GB");
        mobile.setData(data);

        System.out.println(mobile);
        // Java Object -> JSON
        gson = new Gson();
        String jsonStringobject = gson.toJson(mobile);
        return jsonStringobject;
    }
    // Convert the JSON String to Java Object so that we can verify response Body
    // DeSerialization
    public ResponseMobile mobileResponseJava(String responseString){
        gson = new Gson();
        ResponseMobile responseMobile = gson.fromJson(responseString,ResponseMobile.class);
        return responseMobile;
    }

    // Serialization
    public String fullUpadtePayloadAsString(){
        Mobile mobile = new Mobile();
        mobile.setName("iQOO CE4");
        Data data = new Data();
        data.setYear(2024);
        data.setPrice(20000.99);
        data.setCPUModel("SnapDragon");
        data.setHardDiskSize("128 GB");
        mobile.setData(data);
        // Java Object -> JSON
        gson = new Gson();
        String jsonStringobject = gson.toJson(mobile);
        return jsonStringobject;
    }
    //DeSerialization
    public Mobile getResponseFromJSON(String getResponse){
        gson = new Gson();
        Mobile mobile = gson.fromJson(getResponse, Mobile.class);
        return mobile;
    }

}
