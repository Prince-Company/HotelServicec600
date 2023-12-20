package com.hotel.HotelService.repositories;

import com.hotel.HotelService.entities.Hotel;
import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface HotelRepo extends JpaRepository<Hotel,String> {

}
