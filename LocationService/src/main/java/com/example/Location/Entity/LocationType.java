package com.example.Location.Entity;

import java.util.jar.Attributes.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationType {

	@Id
	private int locationTypeId;
	private String description;
	
	
	
	
	@OneToOne(mappedBy = "locationType")
	private Location location;
	
	public LocationType() {
		// TODO Auto-generated constructor stub
	}
	
	


	public LocationType(int locationTypeId, String description) {
		super();
		this.locationTypeId = locationTypeId;
		this.description = description;
		
	}




	public int getLocationTypeId() {
		return locationTypeId;
	}


	public void setLocationTypeId(int locationTypeId) {
		this.locationTypeId = locationTypeId;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}




//	public Location getLocation() {
//		return location;
//	}
//
//
//
//
//	public void setLocation(Location location) {
//		this.location = location;
//	}


	


	
	

	
	
}
