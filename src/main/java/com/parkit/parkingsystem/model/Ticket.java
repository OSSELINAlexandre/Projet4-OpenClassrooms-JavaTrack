package com.parkit.parkingsystem.model;

import java.util.Date;

/**
 * <b>Ticket is the model to represent the Ticket from the Database in our
 * application.</b>
 * <p>
 * A Ticket is composed, in the DB and therefore in our model, of :
 * <ul>
 * <li>an ID</li>
 * <li>a ParkingSpot</li>
 * <li>a Price</li>
 * <li>an InTime</li>
 * <li>an OutTime</li>
 * </ul>
 * </p>
 * 
 * 
 * @author Alexandre OSSELIN
 * @version 1.0
 */

public class Ticket {
    private int id;
    private ParkingSpot parkingSpot;
    private String vehicleRegNumber;
    private double price;
    private Date inTime;
    private Date outTime;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public ParkingSpot getParkingSpot() {
	return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
	this.parkingSpot = parkingSpot;
    }

    public String getVehicleRegNumber() {
	return vehicleRegNumber;
    }

    public void setVehicleRegNumber(String vehicleRegNumber) {
	this.vehicleRegNumber = vehicleRegNumber;
    }

    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
	this.price = price;
    }

    public Date getInTime() {
	return inTime;
    }

    public void setInTime(Date inTime) {
	this.inTime = inTime;
    }

    public Date getOutTime() {
	return outTime;
    }

    public void setOutTime(Date outTime) {
	this.outTime = outTime;
    }
}
