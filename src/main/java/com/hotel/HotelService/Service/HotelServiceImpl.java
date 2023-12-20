package com.hotel.HotelService.Service;

import com.hotel.HotelService.entities.Hotel;
import com.hotel.HotelService.exception.ResourceNotFoundException;
import com.hotel.HotelService.repositories.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class HotelServiceImpl implements HotelService{

  @Autowired
    private HotelRepo hotelrepo;

    @Override
    public Hotel createHotel(Hotel hotel) {
       String id= UUID.randomUUID().toString();
       hotel.setId(id);

        return hotelrepo.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {

        return hotelrepo.findAll();
    }

    @Override
    public Hotel getHotelById(String id) {
        return hotelrepo.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Not Found"));
    }
}

