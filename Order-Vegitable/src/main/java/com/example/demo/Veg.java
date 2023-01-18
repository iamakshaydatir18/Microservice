package com.example.demo;


@javax.persistence.Entity
public class Veg {
	@javax.persistence.Id
	private int ID;
	private String name;
	private long cost;
	private String port;
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Veg [ID=" + ID + ", name=" + name + ", cost=" + cost + ", port=" + port + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
}
