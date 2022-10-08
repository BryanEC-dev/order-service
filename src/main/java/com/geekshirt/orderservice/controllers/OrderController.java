package com.geekshirt.orderservice.controllers;

import com.geekshirt.orderservice.dto.OrderResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class OrderController {

    @GetMapping(value = "order")
    public ResponseEntity<List<OrderResponse>> findAll() {
        List<OrderResponse> orderList = new ArrayList();

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setStatus("Pending");
        orderResponse.setOrderId("1");
        orderResponse.setAccountId("99999");
        orderResponse.setTotalAmount(100.00);
        orderResponse.setTotalTax(20.00);
        orderResponse.setTransactionDate(new Date());

        OrderResponse orderResponse2 = new OrderResponse();
        orderResponse2.setStatus("Pending");
        orderResponse2.setOrderId("2");
        orderResponse2.setAccountId("99099");
        orderResponse2.setTotalAmount(100.00);
        orderResponse2.setTotalTax(20.00);
        orderResponse2.setTransactionDate(new Date());

        orderList.add(orderResponse);
        orderList.add(orderResponse2);

        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }


    @GetMapping(value = "order/{orderId}")
    public ResponseEntity<OrderResponse> findById(@PathVariable String orderId){

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setStatus("Pending");
        orderResponse.setOrderId("1");
        orderResponse.setAccountId("99999");
        orderResponse.setTotalAmount(100.00);
        orderResponse.setTotalTax(20.00);
        orderResponse.setTransactionDate(new Date());

        return new ResponseEntity<>(orderResponse, HttpStatus.OK);
    }


    @PostMapping (value = "order/create")
    public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest payload){

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setStatus("Pending");
        orderResponse.setOrderId("1");
        orderResponse.setAccountId("99999");
        orderResponse.setTotalAmount(100.00);
        orderResponse.setTotalTax(20.00);

        return new ResponseEntity<>(orderResponse, HttpStatus.CREATED);
    }


}
