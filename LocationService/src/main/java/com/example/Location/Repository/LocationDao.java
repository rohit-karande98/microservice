package com.example.Location.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Location.Entity.Location;

@Repository
public interface LocationDao extends JpaRepository<Location, Integer>{

	public Location findByLocationId(int id);
}
