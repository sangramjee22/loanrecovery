package com.loanrecovery.pay.app.model;

import javax.persistence.*;

@Entity
@Table(name = "payout_code")
public class PayoutCode {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, updatable = false)
  private Long id;
  @Column(name = "CODE",nullable = false)
  private String code;
  @Column(name = "RB_BKT_CODE", nullable = false)
  private String rbBucketCode;
  @Column(name = "POS_BKT_CODE", nullable = false)
  private String posBucketCode;

  public PayoutCode(Long id, String code, String rbBucketCode, String posBucketCode) {
    this.id = id;
    this.code = code;
    this.rbBucketCode = rbBucketCode;
    this.posBucketCode = posBucketCode;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getRbBucketCode() {
    return rbBucketCode;
  }

  public void setRbBucketCode(String rbBucketCode) {
    this.rbBucketCode = rbBucketCode;
  }

  public String getPosBucketCode() {
    return posBucketCode;
  }

  public void setPosBucketCode(String posBucketCode) {
    this.posBucketCode = posBucketCode;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "PayoutCode{" +
            "id=" + id +
            ", code='" + code + '\'' +
            ", rbBucketCode='" + rbBucketCode + '\'' +
            ", posBucketCode='" + posBucketCode + '\'' +
            '}';
  }
}
