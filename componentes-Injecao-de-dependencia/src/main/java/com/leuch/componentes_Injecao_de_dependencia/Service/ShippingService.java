package com.leuch.componentes_Injecao_de_dependencia.Service;

import com.leuch.componentes_Injecao_de_dependencia.Entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService
{
    private Order order;

    public double shipment(Order order)
    {
           if(order.getPrice() < 100.0)  { return 20.0;  }
           else if (order.getPrice() > 100.0 & order.getPrice() < 200.0) { return 12.0;}
           else { return 0.0; }
    }


}
