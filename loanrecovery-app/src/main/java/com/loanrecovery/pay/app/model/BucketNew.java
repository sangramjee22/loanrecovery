package com.loanrecovery.pay.app.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "bkts_new")
public class BucketNew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(name = "BKT_ID",nullable = false)
    private Integer bktId;
    @Column(name = "RB_ID",nullable = false)
    @Size(min =5, max=20)
    private String rbId;
    @Column(name = "POS_PERCENTGE_05",nullable = false)
    private Integer posPer05;
    @Column(name = "POS_PERCENTGE_08",nullable = false)
    private Integer posPer08;
    @Column(name = "POS_PERCENTGE_12",nullable = false)
    private Integer posPer12;
    @Column(name = "POS_PERCENTGE_15",nullable = false)
    private Integer posPer15;
    @Column(name = "POS_PERCENTGE_16",nullable = false)
    private Integer posPer16;
    @Column(name = "POS_PERCENTGE_20",nullable = false)
    private Integer posPer20;
    @Column(name = "POS_PERCENTGE_25",nullable = false)
    private Integer posPer25;
    @Column(name = "POS_PERCENTGE_30",nullable = false)
    private Integer posPer30;
    @Column(name = "POS_PERCENTGE_35",nullable = false)
    private Integer posPer35;
    @Column(name = "POS_PERCENTGE_40",nullable = false)
    private Integer posPer40;
    @Column(name = "POS_PERCENTGE_45",nullable = false)
    private Integer posPer45;
    @Column(name = "POS_PERCENTGE_50",nullable = false)
    private Integer posPer50;
    @Column(name = "POS_PERCENTGE_55",nullable = false)
    private Integer posPer55;
    @Column(name = "POS_PERCENTGE_60",nullable = false)
    private Integer posPer60;
    @Column(name = "POS_PERCENTGE_65",nullable = false)
    private Integer posPer65;
    @Column(name = "POS_PERCENTGE_70",nullable = false)
    private Integer posPer70;
    @Column(name = "POS_PERCENTGE_75",nullable = false)
    private Integer posPer75;
    @Column(name = "POS_PERCENTGE_77",nullable = false)
    private Integer posPer77;
    @Column(name = "POS_PERCENTGE_80",nullable = false)
    private Integer posPer80;
    @Column(name = "POS_PERCENTGE_83",nullable = false)
    private Integer posPer83;
    @Column(name = "POS_PERCENTGE_85",nullable = false)
    private Integer posPer85;
    @Column(name = "POS_PERCENTGE_86",nullable = false)
    private Integer posPer86;
    @Column(name = "POS_PERCENTGE_87",nullable = false)
    private Integer posPer87;
    @Column(name = "POS_PERCENTGE_90",nullable = false)
    private Integer posPer90;
    @Column(name = "POS_PERCENTGE_93",nullable = false)
    private Integer posPer93;
    @Column(name = "POS_PERCENTGE_94",nullable = false)
    private Integer posPer94;
    @Column(name = "POS_PERCENTGE_96",nullable = false)
    private Integer posPer96;
    @Column(name = "POS_PERCENTGE_97",nullable = false)
    private Integer posPer97;
    @Column(name = "TL_PERCENTGE_",nullable = false)
    private Integer tlPerc;
    @Column(name = "CBC_EX_PAYOUT",nullable = false)
    private Integer cbcExPerc;
    @Column(name = "CBC_TL_PAYOUT",nullable = false)
    private Integer cbcTlPerc;
    public BucketNew(Long id, Integer bktId, String rbId,
                     Integer posPer05, Integer posPer08,
                     Integer posPer12, Integer posPer15,
                     Integer posPer16, Integer posPer20,
                     Integer posPer25, Integer posPer30,
                     Integer posPer35, Integer posPer40,
                     Integer posPer45, Integer posPer50,
                     Integer posPer55, Integer posPer60,
                     Integer posPer65, Integer posPer70,
                     Integer posPer75, Integer posPer77,
                     Integer posPer80, Integer posPer83,
                     Integer posPer85, Integer posPer86,
                     Integer posPer87, Integer posPer90,
                     Integer posPer93, Integer posPer94,
                     Integer posPer96, Integer posPer97,
                     Integer tlPerc, Integer cbcExPerc, Integer cbcTlPerc) {
        this.id = id;
        this.bktId = bktId;
        this.rbId = rbId;
        this.posPer05 = posPer05;
        this.posPer08 = posPer08;
        this.posPer12 = posPer12;
        this.posPer15 = posPer15;
        this.posPer16 = posPer16;
        this.posPer20 = posPer20;
        this.posPer25 = posPer25;
        this.posPer30 = posPer30;
        this.posPer35 = posPer35;
        this.posPer40 = posPer40;
        this.posPer45 = posPer45;
        this.posPer50 = posPer50;
        this.posPer55 = posPer55;
        this.posPer60 = posPer60;
        this.posPer65 = posPer65;
        this.posPer70 = posPer70;
        this.posPer75 = posPer75;
        this.posPer77 = posPer77;
        this.posPer80 = posPer80;
        this.posPer83 = posPer83;
        this.posPer85 = posPer85;
        this.posPer86 = posPer86;
        this.posPer87 = posPer87;
        this.posPer90 = posPer90;
        this.posPer93 = posPer93;
        this.posPer94 = posPer94;
        this.posPer96 = posPer96;
        this.posPer97 = posPer97;
        this.tlPerc = tlPerc;
        this.cbcExPerc = cbcExPerc;
        this.cbcTlPerc = cbcTlPerc;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBktId() {
        return bktId;
    }

    public void setBktId(Integer bktId) {
        this.bktId = bktId;
    }

    public String getRbId() {
        return rbId;
    }

    public void setRbId(String rbId) {
        this.rbId = rbId;
    }

    public Integer getPosPer05() {
        return posPer05;
    }

    public void setPosPer05(Integer posPer05) {
        this.posPer05 = posPer05;
    }

    public Integer getPosPer08() {
        return posPer08;
    }

    public void setPosPer08(Integer posPer08) {
        this.posPer08 = posPer08;
    }

    public Integer getPosPer12() {
        return posPer12;
    }

    public void setPosPer12(Integer posPer12) {
        this.posPer12 = posPer12;
    }

    public Integer getPosPer15() {
        return posPer15;
    }

    public void setPosPer15(Integer posPer15) {
        this.posPer15 = posPer15;
    }

    public Integer getPosPer16() {
        return posPer16;
    }

    public void setPosPer16(Integer posPer16) {
        this.posPer16 = posPer16;
    }

    public Integer getPosPer20() {
        return posPer20;
    }

    public void setPosPer20(Integer posPer20) {
        this.posPer20 = posPer20;
    }

    public Integer getPosPer25() {
        return posPer25;
    }

    public void setPosPer25(Integer posPer25) {
        this.posPer25 = posPer25;
    }

    public Integer getPosPer30() {
        return posPer30;
    }

    public void setPosPer30(Integer posPer30) {
        this.posPer30 = posPer30;
    }

    public Integer getPosPer35() {
        return posPer35;
    }

    public void setPosPer35(Integer posPer35) {
        this.posPer35 = posPer35;
    }

    public Integer getPosPer40() {
        return posPer40;
    }

    public void setPosPer40(Integer posPer40) {
        this.posPer40 = posPer40;
    }

    public Integer getPosPer45() {
        return posPer45;
    }

    public void setPosPer45(Integer posPer45) {
        this.posPer45 = posPer45;
    }

    public Integer getPosPer50() {
        return posPer50;
    }

    public void setPosPer50(Integer posPer50) {
        this.posPer50 = posPer50;
    }

    public Integer getPosPer55() {
        return posPer55;
    }

    public void setPosPer55(Integer posPer55) {
        this.posPer55 = posPer55;
    }

    public Integer getPosPer60() {
        return posPer60;
    }

    public void setPosPer60(Integer posPer60) {
        this.posPer60 = posPer60;
    }

    public Integer getPosPer65() {
        return posPer65;
    }

    public void setPosPer65(Integer posPer65) {
        this.posPer65 = posPer65;
    }

    public Integer getPosPer70() {
        return posPer70;
    }

    public void setPosPer70(Integer posPer70) {
        this.posPer70 = posPer70;
    }

    public Integer getPosPer75() {
        return posPer75;
    }

    public void setPosPer75(Integer posPer75) {
        this.posPer75 = posPer75;
    }

    public Integer getPosPer77() {
        return posPer77;
    }

    public void setPosPer77(Integer posPer77) {
        this.posPer77 = posPer77;
    }

    public Integer getPosPer80() {
        return posPer80;
    }

    public void setPosPer80(Integer posPer80) {
        this.posPer80 = posPer80;
    }

    public Integer getPosPer83() {
        return posPer83;
    }

    public void setPosPer83(Integer posPer83) {
        this.posPer83 = posPer83;
    }

    public Integer getPosPer85() {
        return posPer85;
    }

    public void setPosPer85(Integer posPer85) {
        this.posPer85 = posPer85;
    }

    public Integer getPosPer86() {
        return posPer86;
    }

    public void setPosPer86(Integer posPer86) {
        this.posPer86 = posPer86;
    }

    public Integer getPosPer87() {
        return posPer87;
    }

    public void setPosPer87(Integer posPer87) {
        this.posPer87 = posPer87;
    }

    public Integer getPosPer90() {
        return posPer90;
    }

    public void setPosPer90(Integer posPer90) {
        this.posPer90 = posPer90;
    }

    public Integer getPosPer93() {
        return posPer93;
    }

    public void setPosPer93(Integer posPer93) {
        this.posPer93 = posPer93;
    }

    public Integer getPosPer94() {
        return posPer94;
    }

    public void setPosPer94(Integer posPer94) {
        this.posPer94 = posPer94;
    }

    public Integer getPosPer96() {
        return posPer96;
    }

    public void setPosPer96(Integer posPer96) {
        this.posPer96 = posPer96;
    }

    public Integer getPosPer97() {
        return posPer97;
    }

    public void setPosPer97(Integer posPer97) {
        this.posPer97 = posPer97;
    }

    public Integer getTlPerc() {
        return tlPerc;
    }

    public void setTlPerc(Integer tlPerc) {
        this.tlPerc = tlPerc;
    }

    public Integer getCbcExPerc() {
        return cbcExPerc;
    }

    public void setCbcExPerc(Integer cbcExPerc) {
        this.cbcExPerc = cbcExPerc;
    }

    public Integer getCbcTlPerc() {
        return cbcTlPerc;
    }

    public void setCbcTlPerc(Integer cbcTlPerc) {
        this.cbcTlPerc = cbcTlPerc;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "BucketNew{" +
                "id=" + id +
                ", bktId=" + bktId +
                ", rbId='" + rbId + '\'' +
                ", posPer05=" + posPer05 +
                ", posPer08=" + posPer08 +
                ", posPer12=" + posPer12 +
                ", posPer15=" + posPer15 +
                ", posPer16=" + posPer16 +
                ", posPer20=" + posPer20 +
                ", posPer25=" + posPer25 +
                ", posPer30=" + posPer30 +
                ", posPer35=" + posPer35 +
                ", posPer40=" + posPer40 +
                ", posPer45=" + posPer45 +
                ", posPer50=" + posPer50 +
                ", posPer55=" + posPer55 +
                ", posPer60=" + posPer60 +
                ", posPer65=" + posPer65 +
                ", posPer70=" + posPer70 +
                ", posPer75=" + posPer75 +
                ", posPer77=" + posPer77 +
                ", posPer80=" + posPer80 +
                ", posPer83=" + posPer83 +
                ", posPer85=" + posPer85 +
                ", posPer86=" + posPer86 +
                ", posPer87=" + posPer87 +
                ", posPer90=" + posPer90 +
                ", posPer93=" + posPer93 +
                ", posPer94=" + posPer94 +
                ", posPer96=" + posPer96 +
                ", posPer97=" + posPer97 +
                ", tlPerc=" + tlPerc +
                ", cbcExPerc=" + cbcExPerc +
                ", cbcTlPerc=" + cbcTlPerc +
                '}';
    }
}
