package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class fruit {
	    @Id
	    private int ID;
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		private String name;
		private Double cost;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Double getCost() {
			return cost;
		}
		public void setCost(Double cost) {
			this.cost = cost;
		}
		@Override
		public String toString() {
			return "fruit [ID=" + ID + ", name=" + name + ", cost=" + cost + "]";
		}
		
}
