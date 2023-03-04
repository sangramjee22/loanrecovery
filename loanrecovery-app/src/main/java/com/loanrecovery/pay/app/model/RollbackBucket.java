package com.loanrecovery.pay.app.model;

import javax.persistence.*;
@Entity
@Table(name = "rb_bkt_info")
public class RollbackBucket {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;


    @Column(name = "CODE", nullable = false)
    private String rollbackCode;

    @Column(name = "BKT_NAME", nullable = false)
    private String rbBasketName;

    @Column(name = "RB_PERCENTAGE", nullable = false)
    private Double rbPercentage;


    public RollbackBucket(Long id, String rollbackCode, String rbBasketName, Double rbPercentage) {
        this.id = id;
        this.rollbackCode = rollbackCode;
        this.rbBasketName = rbBasketName;
        this.rbPercentage = rbPercentage;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRollbackCode() {
        return rollbackCode;
    }

    public void setRollbackCode(String rollbackCode) {
        this.rollbackCode = rollbackCode;
    }

    public String getRbBasketName() {
        return rbBasketName;
    }

    public void setRbBasketName(String rbBasketName) {
        this.rbBasketName = rbBasketName;
    }

    public Double getRbPercentage() {
        return rbPercentage;
    }

    public void setRbPercentage(Double rbPercentage) {
        this.rbPercentage = rbPercentage;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "RollbackBucket{" +
                "id=" + id +
                ", rollbackCode='" + rollbackCode + '\'' +
                ", rbBasketName='" + rbBasketName + '\'' +
                ", rbPercentage=" + rbPercentage +
                '}';
    }
}
