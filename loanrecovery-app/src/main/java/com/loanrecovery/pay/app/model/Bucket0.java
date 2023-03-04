package com.loanrecovery.pay.app.model;

import javax.persistence.*;

@Entity
@Table(name = "bkt0")
public class Bucket0 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(name = "POS_PERCENTGE", nullable = false)
    private Double posperc;
    @Column(name = "EXE_PAYOUT", nullable = false)
    private Double exepayout;
    @Column(name = "TL_PAYOUT", nullable = false)
    private Double tlpatout;
    @Column(name = "CBC_EX_PAYOUT", nullable = false)
    private Double cbcexepayout;
    @Column(name = "CBC_TL_PAYOUT", nullable = false)
    private Double cbctlpayout;

    public Bucket0(Long id, Double posperc, Double exepayout, Double tlpatout, Double cbcexepayout, Double cbctlpayout) {
        this.id = id;
        this.posperc = posperc;
        this.exepayout = exepayout;
        this.tlpatout = tlpatout;
        this.cbcexepayout = cbcexepayout;
        this.cbctlpayout = cbctlpayout;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPosperc() {
        return posperc;
    }

    public void setPosperc(Double posperc) {
        this.posperc = posperc;
    }

    public Double getExepayout() {
        return exepayout;
    }

    public void setExepayout(Double exepayout) {
        this.exepayout = exepayout;
    }

    public Double getTlpatout() {
        return tlpatout;
    }

    public void setTlpatout(Double tlpatout) {
        this.tlpatout = tlpatout;
    }

    public Double getCbcexepayout() {
        return cbcexepayout;
    }

    public void setCbcexepayout(Double cbcexepayout) {
        this.cbcexepayout = cbcexepayout;
    }

    public Double getCbctlpayout() {
        return cbctlpayout;
    }

    public void setCbctlpayout(Double cbctlpayout) {
        this.cbctlpayout = cbctlpayout;
    }

   @Override
    public String toString() {
        return "Bucket0{" +
                "id=" + id +
                ", posperc=" + posperc +
                ", exepayout=" + exepayout +
                ", tlpatout=" + tlpatout +
                ", cbcexepayout=" + cbcexepayout +
                ", cbctlpayout=" + cbctlpayout +
                '}';
    }
}
