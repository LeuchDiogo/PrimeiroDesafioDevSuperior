package com.leuch.componentes_Injecao_de_dependencia.Service;

import com.leuch.componentes_Injecao_de_dependencia.Entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private Order order;

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService)
    {
        this.shippingService = shippingService;
    }
    public double total(Order order)
    {
        return order.getPrice() - order.getPrice() * (order.getDiscount() / 100) + shippingService.shipment(order);
    }
}
