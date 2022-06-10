package com.example.Location.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Location.Entity.LocationType;
import com.example.Location.Repository.LocationTypeDao;

@Service
public class LocationTypeService {

	@Autowired
	private LocationTypeDao locationTypeDao;
	
	public LocationType save(LocationType Ltype) {
		return locationTypeDao.save(Ltype);
	}
	
	public LocationType findById(int id) {
		return locationTypeDao.findByLocationTypeId(id);
	}
}
