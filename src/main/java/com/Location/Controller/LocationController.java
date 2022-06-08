package com.Location.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Location.Entity.Location;
import com.Location.Repository.LocationRepository;

@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	LocationRepository locationRepo;
	
	@GetMapping("/")
	public List<Location> getLocation() {
		List<Location> location = locationRepo.findAll();
		return location;
		
	}
	
	
	@GetMapping("/id/{id}")
	public Location getLocationById(@PathVariable ("id") long id) {
		Optional<Location> findById = locationRepo.findById(id);
		Location location = findById.get();
		return location;
	}
	
	@PostMapping("/add")
	public void saveLocation(@RequestBody Location location) {
		locationRepo.save(location);
	}
	
	@PutMapping("/put")
	public void updateLocation(@RequestBody Location location) {
		locationRepo.save(location);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteLocation(@PathVariable ("id") long id) {
		locationRepo.deleteById(id);
	}
	
}
