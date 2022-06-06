package com.example.droolsdemoprj.entity;

public class ElectricBill {
    private Integer id;
    private String area;
    private Integer noElectric;
    private Double totalAmount;

    public ElectricBill(Integer id, String area, Integer noElectric) {
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

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void calculateTotalAmount(Double rate) {

        this.totalAmount = this.noElectric * rate;
    }
}
