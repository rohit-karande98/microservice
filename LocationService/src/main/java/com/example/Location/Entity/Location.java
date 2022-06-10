package com.example.Location.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int locationId;
	@Size(min = 2, message = "location should have at least 2 characters")
	private String locationName;
	private String description;
	private String address;
	private String region;
	private String distrik;
	private String climateId;
	private String storeSizeId;
	private String primaryDc;
	@NotNull
	private Double latitude;
	private Double longitude;
	private Date activationDate;
	private Date deactivationDate;
	private String channel;
	
	
	
	
	
	
	@OneToOne(targetEntity = LocationType.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_loc", referencedColumnName = "locationTypeId")
	private LocationType locationType;
	
	public Location() {
		// TODO Auto-generated constructor stub
	}

	



	public Location(int locationId, String locationName, String description, String address, String region,
			String distrik, String climateId, String storeSizeId, String primaryDc, Double latitude, Double longitude,
			Date activationDate, Date deactivationDate, String channel, LocationType locationType) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.description = description;
		this.address = address;
		this.region = region;
		this.distrik = distrik;
		this.climateId = climateId;
		this.storeSizeId = storeSizeId;
		this.primaryDc = primaryDc;
		this.latitude = latitude;
		this.longitude = longitude;
		this.activationDate = activationDate;
		this.deactivationDate = deactivationDate;
		this.channel = channel;
		this.locationType = locationType;
	}





	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDistrik() {
		return distrik;
	}

	public void setDistrik(String distrik) {
		this.distrik = distrik;
	}

	public String getClimateId() {
		return climateId;
	}

	public void setClimateId(String climateId) {
		this.climateId = climateId;
	}

	public String getStoreSizeId() {
		return storeSizeId;
	}

	public void setStoreSizeId(String storeSizeId) {
		this.storeSizeId = storeSizeId;
	}

	public String getPrimaryDc() {
		return primaryDc;
	}

	public void setPrimaryDc(String primaryDc) {
		this.primaryDc = primaryDc;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Date getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}

	public Date getDeactivationDate() {
		return deactivationDate;
	}

	public void setDeactivationDate(Date deactivationDate) {
		this.deactivationDate = deactivationDate;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}


























	public LocationType getLocationType() {
		return locationType;
	}


























	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}












//
//	public int getLocationTypeId() {
//		return locationTypeId;
//	}
//
//
//
//
//
//
//
//
//
//
//
//
//
//	public void setLocationTypeId(int locationTypeId) {
//		this.locationTypeId = locationTypeId;
//	}
//



//	public LocationType getLocationType() {
//		return locationType;
//	}
//
//	public void setLocationType(LocationType locationType) {
//		this.locationType = locationType;
//	}
//
//	
//	

	


	
	
	
	

	
	
	
	
}
