package com.loanrecovery.pay.app.model;

import javax.persistence.*;
@Entity
@Table(name = "pos_bkt_info")
public class PosBucket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(name = "CODE", nullable = false)
    private String poscode;
    @Column(name = "BKT_NAME", nullable = false)
    private String basketName;
    @Column(name = "POS_PERCENTAGE", nullable = false)
    private Double posPercentage;

    public PosBucket(Long id, String poscode, String basketName, Double posPercentage) {
        this.id = id;
        this.poscode = poscode;
        this.basketName = basketName;
        this.posPercentage = posPercentage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPoscode() {
        return poscode;
    }

    public void setPoscode(String poscode) {
        this.poscode = poscode;
    }

    public String getBasketName() {
        return basketName;
    }

    public void setBasketName(String basketName) {
        this.basketName = basketName;
    }

    public Double getPosPercentage() {
        return posPercentage;
    }

    public void setPosPercentage(Double posPercentage) {
        this.posPercentage = posPercentage;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "PosBucket{" +
                "id=" + id +
                ", poscode='" + poscode + '\'' +
                ", basketName='" + basketName + '\'' +
                ", posPercentage=" + posPercentage +
                '}';
    }
}
