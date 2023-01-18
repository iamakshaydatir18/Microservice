package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class fruit {
	    @Id
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
		public void setName(String name) {
			this.name = name;
		}
		public long getCost() {
			return cost;
		}
		public void setCost(long cost) {
			this.cost = cost;
		}
		@Override
		public String toString() {
			return "fruit [ID=" + ID + ", name=" + name + ", cost=" + cost + ", port=" + port + "]";
		}
		
}
