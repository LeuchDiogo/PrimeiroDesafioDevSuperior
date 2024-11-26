package com.leuch.componentes_Injecao_de_dependencia.Entities;

public class Order {
    private Integer Id;
    private Double Price;
    private Double Discount;

    public Order(Integer id, Double price, Double discount) {
        Id = id;
        Price = price;
        Discount = discount;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Double getDiscount() {
        return Discount;
    }

    public void setDiscount(Double discount) {
        Discount = discount;
    }

}
