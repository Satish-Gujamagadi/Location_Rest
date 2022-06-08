package com.Location.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Location.Entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
