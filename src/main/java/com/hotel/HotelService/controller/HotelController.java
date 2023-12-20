package com.hotel.HotelService.controller;


import com.hotel.HotelService.Service.HotelService;
import com.hotel.HotelService.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelservice;

    //i am hotel controller

    @PostMapping("/add")
    public ResponseEntity<Hotel>createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelservice.createHotel(hotel));

    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel>getById(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(hotelservice.getHotelById(hotelId));

    }

    @GetMapping
    public ResponseEntity<List<Hotel>>getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(hotelservice.getAllHotel());

    }


}
