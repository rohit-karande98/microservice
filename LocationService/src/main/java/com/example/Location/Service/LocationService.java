package com.example.Location.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.Location.Entity.Location;
import com.example.Location.Repository.LocationDao;

import ch.qos.logback.classic.Logger;

@Service
public class LocationService {

	@Autowired
	private LocationDao locationDao;
	
	@CachePut(cacheNames = "location", key="#id")
	public Location saveLocation(Location location) {
		System.out.println("location save method ");
	    return locationDao.save(location);
	}
	
	@Cacheable(cacheNames = "location", key="#id")
	public Location findLocationById(int id) {
		Optional<Location> location= locationDao.findById(id);
		if(location.isPresent()) {
			return location.get();
		}
		else {
			return new Location();
		}
		
	}
	

	@CacheEvict(cacheNames = "location", key="#id")
	public void deleteLocationById(int id) {
		 locationDao.deleteById(id);
		 
	}
	
	
}
