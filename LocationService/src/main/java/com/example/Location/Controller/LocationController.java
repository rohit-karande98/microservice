package com.example.Location.Controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Location.Entity.Location;
import com.example.Location.Entity.RequestLocation;
import com.example.Location.Repository.LocationDao;
import com.example.Location.Service.LocationService;

import io.micrometer.core.ipc.http.HttpSender.Response;


@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	private LocationService locationService;
	
	@Autowired
	private LocationDao locationDao;
	
	@PostMapping("/save")
	public  ResponseEntity<?> SaveLocation(@Valid @RequestBody RequestLocation req) {
		Location result= locationDao.save(req.getLocation());
		if(result!=null) 
			return ResponseEntity.ok(result);
		else
			return ResponseEntity.ok("location not added");
		
	}
	
	
	
	@GetMapping("/{id}")
	public Location findById(@PathVariable("id") int id) {
		return locationService.findLocationById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteLocationById(@PathVariable("id") int id) {
		locationService.deleteLocationById(id);
		return "Location Removed" ;
	}
	
}
