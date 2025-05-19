package com.resfulapiautomation.pojos.request;

import com.google.gson.annotations.SerializedName;

public class Mobile {

	@SerializedName("data")
	private Data data;

	@SerializedName("name")
	private String name;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}