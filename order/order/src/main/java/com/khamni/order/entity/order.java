/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khamni.order.entity;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class order {
    private Long id;
    private Long productId; 
    private int jumlah; 
    private Date tanggal; 
    private String status;
    private double total; 
    
    public order(Long id, Long productId, int jumlah, Date tanggal, String status, double total) {
        this.id = id;
        this.productId = productId;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
        this.status = status;
        this.total = total;
    }
public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

    