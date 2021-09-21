package com.xworkz.appartment.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="apartment")
public class AppartmentEntity implements Serializable {
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
@Column(name="APARMENT_ID")
private byte apartmentID;
@Column(name="NO_OF_FLOORS")
private int noOfFloors;
@Column(name="IS_LIFT_THERE")
private boolean isLiftAvailable;
@Column(name="FLAT_PRICE")
private double flatPrice;
@Column(name="IS_PARKING_THERE")
private boolean isParkingAvailable;
public AppartmentEntity() {
	// TODO Auto-generated constructor stub
}
public AppartmentEntity(byte apartmentID, int noOfFloors, boolean isLiftAvailable, double flatPrice,
		boolean isParkingAvailable) {
	super();
	this.apartmentID = apartmentID;
	this.noOfFloors = noOfFloors;
	this.isLiftAvailable = isLiftAvailable;
	this.flatPrice = flatPrice;
	this.isParkingAvailable = isParkingAvailable;
}
@Override
public String toString() {
	return "ApartmentEntity [apartmentID=" + apartmentID + ", noOfFloors=" + noOfFloors + ", isLiftAvailable="
			+ isLiftAvailable + ", flatPrice=" + flatPrice + ", isParkingAvailable=" + isParkingAvailable + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + apartmentID;
	long temp;
	temp = Double.doubleToLongBits(flatPrice);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + (isLiftAvailable ? 1231 : 1237);
	result = prime * result + (isParkingAvailable ? 1231 : 1237);
	result = prime * result + noOfFloors;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AppartmentEntity other = (AppartmentEntity) obj;
	if (apartmentID != other.apartmentID)
		return false;
	if (Double.doubleToLongBits(flatPrice) != Double.doubleToLongBits(other.flatPrice))
		return false;
	if (isLiftAvailable != other.isLiftAvailable)
		return false;
	if (isParkingAvailable != other.isParkingAvailable)
		return false;
	if (noOfFloors != other.noOfFloors)
		return false;
	return true;
}
public byte getApartmentID() {
	return apartmentID;
}
public void setApartmentID(byte apartmentID) {
	this.apartmentID = apartmentID;
}
public int getNoOfFloors() {
	return noOfFloors;
}
public void setNoOfFloors(int noOfFloors) {
	this.noOfFloors = noOfFloors;
}
public boolean isLiftAvailable() {
	return isLiftAvailable;
}
public void setLiftAvailable(boolean isLiftAvailable) {
	this.isLiftAvailable = isLiftAvailable;
}
public double getFlatPrice() {
	return flatPrice;
}
public void setFlatPrice(double flatPrice) {
	this.flatPrice = flatPrice;
}
public boolean isParkingAvailable() {
	return isParkingAvailable;
}
public void setParkingAvailable(boolean isParkingAvailable) {
	this.isParkingAvailable = isParkingAvailable;
}

}