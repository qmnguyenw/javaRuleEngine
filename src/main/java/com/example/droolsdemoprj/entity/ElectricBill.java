package com.example.droolsdemoprj.entity;

import java.math.BigDecimal;

public class ElectricBill {
    private Integer id;
    private String area;
    private Integer noElectric;
    private BigDecimal totalAmount;

    public ElectricBill(Integer id, String area, Integer noElectric) {
        super();
        this.id = id;
        this.area = area;
        this.noElectric = noElectric;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getNoElectric() {
        return noElectric;
    }

    public void setNoElectric(Integer noElectric) {
        this.noElectric = noElectric;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
