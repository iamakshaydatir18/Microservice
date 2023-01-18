package com.example.demo;

public class Order {
	    private int ID;
	    private String name;
		private long quantity;
		private long totalCost;
		private long cost;
		private String port;
		
		public Order() {
			super();
		}
		public Order(int iD, String name, long quantity, long totalCost, long cost, String port) {
			super();
			ID = iD;
			this.name = name;
			this.quantity = quantity;
			this.totalCost = totalCost;
			this.cost = cost;
			this.port = port;
		}
		public String getPort() {
			return port;
		}
		public void setPort(String port) {
			this.port = port;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getQuantity() {
			return quantity;
		}
		public void setQuantity(long quantity) {
			this.quantity = quantity;
		}
		public long getTotalCost() {
			return totalCost;
		}
		public void setTotalCost(long totalCost) {
			this.totalCost = totalCost;
		}
		public long getCost() {
			return cost;
		}
		public void setCost(long cost) {
			this.cost = cost;
		}
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		@Override
		public String toString() {
			return "Order [ID=" + ID + ", name=" + name + ", quantity=" + quantity + ", totalCost=" + totalCost
					+ ", cost=" + cost + ", port=" + port + "]";
		}
		
}
