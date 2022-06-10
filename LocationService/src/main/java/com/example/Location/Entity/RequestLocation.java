package com.example.Location.Entity;



public class RequestLocation {

	private Location location;
	
	public RequestLocation() {
		// TODO Auto-generated constructor stub
	}

	public RequestLocation(Location location) {
		super();
		this.location = location;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "RequestLocation [location=" + location + "]";
	}
	
}
