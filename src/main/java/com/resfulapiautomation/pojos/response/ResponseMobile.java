package com.resfulapiautomation.pojos.response;

import com.google.gson.annotations.SerializedName;

public class ResponseMobile {

	@SerializedName("createdAt")
	private String createdAt;

	@SerializedName("data")
	private ResponseData data;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setData(ResponseData data){
		this.data = data;
	}

	public ResponseData getData(){
		return data;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}
}