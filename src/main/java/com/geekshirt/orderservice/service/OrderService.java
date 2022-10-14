package com.geekshirt.orderservice.service;


import com.geekshirt.orderservice.dto.OrderRequest;
import com.geekshirt.orderservice.entities.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    public Order createOrder(OrderRequest orderRequest) {

        Order response = new Order();
        response.setStatus("Pending");
        response.setOrderId("1");
        response.setAccountId("99999");
        response.setTotalAmount(100.00);
        response.setTotalTax(20.00);
        response.setTransactionDate(new Date());
        return response;
    }

    public List<Order> findAll(){
        List<Order> orderList = new ArrayList();

        Order order = new Order();
        order.setStatus("Pending");
        order.setOrderId("1");
        order.setAccountId("99999");
        order.setTotalAmount(100.00);
        order.setTotalTax(20.00);
        order.setTransactionDate(new Date());

        Order order2 = new Order();
        order2.setStatus("Procesing");
        order2.setOrderId("2");
        order2.setAccountId("99099");
        order2.setTotalAmount(100.00);
        order2.setTotalTax(20.00);
        order2.setTransactionDate(new Date());

        orderList.add(order);
        orderList.add(order2);

        return  orderList;

    }

    public Order findOrderById(Integer  id){

        Order order = new Order();
        order.setStatus("Pending");
        order.setOrderId("1");
        order.setAccountId("99999");
        order.setTotalAmount(100.00);
        order.setTotalTax(20.00);
        order.setTransactionDate(new Date());



        return  order;

    }
}
