package com.pash.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Car {
	@Id
	private int carId;
	private String make;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRgNo() {
		return rgNo;
	}
	public void setRgNo(String rgNo) {
		this.rgNo = rgNo;
	}
	private String model;
	private String rgNo;
	

}
