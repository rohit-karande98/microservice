package com.example.Location.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Location.Entity.LocationType;

@Repository
public interface LocationTypeDao extends JpaRepository<LocationType, Integer>{

	public LocationType findByLocationTypeId(int id);
}
