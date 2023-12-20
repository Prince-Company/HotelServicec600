package com.hotel.HotelService.Service;

import com.hotel.HotelService.entities.Hotel;
import com.hotel.HotelService.repositories.HotelRepo;
import io.micrometer.observation.annotation.Observed;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface HotelService  {

    //create
          Hotel createHotel(Hotel hotel);


    // getAll
           List<Hotel> getAllHotel();


    // get By Id
           Hotel getHotelById(String id);
}
