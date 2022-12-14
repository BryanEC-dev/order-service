package com.geekshirt.orderservice.controllers;

import com.geekshirt.orderservice.dto.OrderRequest;
import com.geekshirt.orderservice.dto.OrderResponse;
import com.geekshirt.orderservice.entities.Order;
import com.geekshirt.orderservice.service.OrderService;
import com.geekshirt.orderservice.util.EntityDtoConverter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Api
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private EntityDtoConverter entityDtoConverter;

    @ApiOperation(value = "Retrieve all existed orders", notes = "This Operation returns all stored orders.")
    @GetMapping(value = "order")
    public ResponseEntity<List<OrderResponse>> findAll() {
        List<Order> orderList = orderService.findAll();


        return new ResponseEntity<>(entityDtoConverter.convertEntityToDto(orderList), HttpStatus.OK);
    }


    @ApiOperation(value = "Retrieve an order based on Id ", notes = "This Operation returns an orders using its Id")
    @GetMapping(value = "order/{orderId}")
    public ResponseEntity<OrderResponse> findById(@PathVariable Integer orderId){
        Order orderResponse = orderService.findOrderById(orderId);


        return new ResponseEntity<>(entityDtoConverter.convertEntityToDto(orderResponse), HttpStatus.OK);
    }

    @ApiOperation(value = "Creates an order", notes = "This Operation creates a new order.")
    @PostMapping (value = "order/create")
    public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest payload){
        Order orderResponse = orderService.createOrder(payload);


        return new ResponseEntity<>(entityDtoConverter.convertEntityToDto(orderResponse), HttpStatus.CREATED);
    }


}
