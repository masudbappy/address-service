package com.masudbappy.controller;

import com.masudbappy.request.CreateAddressRequest;
import com.masudbappy.response.AddressResponse;
import com.masudbappy.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("/create")
    public AddressResponse createAddress (@RequestBody CreateAddressRequest createAddressRequest) {
        return addressService.createAddress(createAddressRequest);
    }

    @GetMapping("/getById/{id}")
    public AddressResponse getById(@PathVariable long id) {
        return addressService.getById(id);
    }

}
