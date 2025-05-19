package com.resfulapiautomation.pojos.request;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("year")
	private int year;

	@SerializedName("price")
	private Object price;

	@SerializedName("CPU model")
	private String cPUModel;

	@SerializedName("Hard disk size")
	private String hardDiskSize;

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}

	public void setPrice(Object price){
		this.price = price;
	}

	public Object getPrice(){
		return price;
	}

	public void setCPUModel(String cPUModel){
		this.cPUModel = cPUModel;
	}

	public String getCPUModel(){
		return cPUModel;
	}

	public void setHardDiskSize(String hardDiskSize){
		this.hardDiskSize = hardDiskSize;
	}

	public String getHardDiskSize(){
		return hardDiskSize;
	}
}