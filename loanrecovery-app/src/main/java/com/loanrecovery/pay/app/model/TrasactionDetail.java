package com.loanrecovery.pay.app.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trasaction")
public class TrasactionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(name = "LOAN_AGREEMENT_NO", nullable = false)
    private String loanAgreementNo;
    @Column(name = "APPLICATION_ID", nullable = false)
    private String applicationId;
    @Column(name = "Status", nullable = false)
    private String status;
    @Column(name = "CODE", nullable = false)
    private String tdCode;
    @Column(name = "Mode", nullable = false)
    private String mode;
    @Column(name = "FLOW_OR_RECOVERY", nullable = false)
    private Integer flowOrRecovery;
    @Column(name = "SECURED", nullable = false)
    private Integer secured;
    @Column(name = "BRANCH", nullable = false)
    private String branch;
    @Column(name = "CUSTOMER_NAME", nullable = false)
    private String customerName;
    @Column(name = "BKT", nullable = false)
    private Integer basketNo;
    @Column(name = "Actual_Bkt", nullable = false)
    private Integer actualBasket;
    @Column(name = "PROD", nullable = false)
    private String productName;
    @Column(name = "POS", nullable = false)
    private Double pos;
    @Column(name = "SOLVE_POS", nullable = false)
    private Double solvePos;
    @Column(name = "EMI_AMOUNT", nullable = false)
    private Double emiAmount;
    @Column(name = "OVERDUE", nullable = false)
    private Double overdue;
    @Column(name = "SOLVE_OD", nullable = false)
    private Double solveOd;
    @Column(name = "CBC", nullable = false)
    private Integer cbc;
    @Column(name = "SCBC", nullable = false)
    private Integer scbc;
    @Column(name = "SALARY_COLL", nullable = false)
    private Double salaryColl;
    @Column(name = "COLL_AMOUNT", nullable = false)
    private Double collAmount;
    @Column(name = "NO_OF_EMI", nullable = false)
    private Integer noOfEmi;
    @Column(name = "ST_EMI", nullable = false)
    private Integer stEmi;
    @Column(name = "RB_EMI", nullable = false)
    private Integer rbEmi;
    @Column(name = "RB_POS", nullable = false)
    private Double rbPos;
    @Column(name = "TOTAL_CHRG", nullable = false)
    private Double totalChrg;
    @Column(name = "BOUNCE_CHARGE_DUE", nullable = false)
    private Double bounceChargeCue;
    @Column(name = "LPP_DUE", nullable = false)
    private Double lppDue;
    @Column(name = "CLERANCE", nullable = false)
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date clerance;
    @Column(name = "TOTAL_OFC_DEPO", nullable = false)
    private String totalOfcDepo;
    @Column(name = "AMOUNT", nullable = false)
    private Double amount;
    @Column(name = "SUPERVISIOR", nullable = false)
    private String supervisiorName;
    @Column(name = "E_Receipt_ID", nullable = false)
    private String eReceiptId;
    @Column(name = "Collector_Name", nullable = false)
    private String collectorName;
    @Column(name = "TC_SETLEMNT", nullable = false)
    private String tcSetlemnt;
    @Column(name = "14th_15th_Mr_Cut", nullable = false)
    private Double fouteenthToth15thMrCut;
    @Column(name = "14th_15th_EX", nullable = false)
    private Double fouteenthToth15thEx;
    @Column(name = "14th_15th_TL", nullable = false)
    private Double fouteenthTo15thTl;
    @Column(name = "20th_Mr_Cut", nullable = false)
    private Double twentyThTothMrCut;
    @Column(name = "20th_Mr_Cut_EX", nullable = false)
    private Double twentyThTothMrCutEx;
    @Column(name = "20th_Mr_Cut_TL", nullable = false)
    private Double twentyThMrCutTl;
    @Column(name = "24th_Mr_Cut", nullable = false)
    private Double twentyFourthtthToMrCut;
    @Column(name = "24th_Mr_Cut_EX", nullable = false)
    private Double wentyFourthtthToMrCutEx;
    @Column(name = "24th_Mr_Cut_TL", nullable = false)
    private Double wentyFourthtthToMrCutTl;
    @Column(name = "MONEY_RCPT", nullable = false)
    private String moneyReceipt;


    public TrasactionDetail(Long id, String loanAgreementNo, String applicationId,
                            String status, String tdCode, String mode, Integer flowOrRecovery,
                            Integer secured, String branch, String customerName, Integer basketNo,
                            Integer actualBasket, String productName, Double pos, Double solvePos,
                            Double emiAmount, Double overdue, Double solveOd, Integer cbc, Integer scbc,
                            Double salaryColl, Double collAmount, Integer noOfEmi, Integer stEmi, Integer rbEmi,
                            Double rbPos, Double totalChrg, Double bounceChargeCue, Double lppDue, Date clerance,
                            String totalOfcDepo, Double amount, String supervisiorName, String eReceiptId,
                            String collectorName, String tcSetlemnt, String moneyReceipt)
    {
        this.id = id;
        this.loanAgreementNo = loanAgreementNo;
        this.applicationId = applicationId;
        this.status = status;
        this.tdCode = tdCode;
        this.mode = mode;
        this.flowOrRecovery = flowOrRecovery;
        this.secured = secured;
        this.branch = branch;
        this.customerName = customerName;
        this.basketNo = basketNo;
        this.actualBasket = actualBasket;
        this.productName = productName;
        this.pos = pos;
        this.solvePos = solvePos;
        this.emiAmount = emiAmount;
        this.overdue = overdue;
        this.solveOd = solveOd;
        this.cbc = cbc;
        this.scbc = scbc;
        this.salaryColl = salaryColl;
        this.collAmount = collAmount;
        this.noOfEmi = noOfEmi;
        this.stEmi = stEmi;
        this.rbEmi = rbEmi;
        this.rbPos = rbPos;
        this.totalChrg = totalChrg;
        this.bounceChargeCue = bounceChargeCue;
        this.lppDue = lppDue;
        this.clerance = clerance;
        this.totalOfcDepo = totalOfcDepo;
        this.amount = amount;
        this.supervisiorName = supervisiorName;
        this.eReceiptId = eReceiptId;
        this.collectorName = collectorName;
        this.tcSetlemnt = tcSetlemnt;
        this.moneyReceipt = moneyReceipt;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoanAgreementNo() {
        return loanAgreementNo;
    }

    public void setLoanAgreementNo(String loanAgreementNo) {
        this.loanAgreementNo = loanAgreementNo;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTdCode() {
        return tdCode;
    }

    public void setTdCode(String tdCode) {
        this.tdCode = tdCode;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Integer getFlowOrRecovery() {
        return flowOrRecovery;
    }

    public void setFlowOrRecovery(Integer flowOrRecovery) {
        this.flowOrRecovery = flowOrRecovery;
    }

    public Integer getSecured() {
        return secured;
    }

    public void setSecured(Integer secured) {
        this.secured = secured;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getBasketNo() {
        return basketNo;
    }

    public void setBasketNo(Integer basketNo) {
        this.basketNo = basketNo;
    }

    public Integer getActualBasket() {
        return actualBasket;
    }

    public void setActualBasket(Integer actualBasket) {
        this.actualBasket = actualBasket;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPos() {
        return pos;
    }

    public void setPos(Double pos) {
        this.pos = pos;
    }

    public Double getSolvePos() {
        return solvePos;
    }

    public void setSolvePos(Double solvePos) {
        this.solvePos = solvePos;
    }

    public Double getEmiAmount() {
        return emiAmount;
    }

    public void setEmiAmount(Double emiAmount) {
        this.emiAmount = emiAmount;
    }

    public Double getOverdue() {
        return overdue;
    }

    public void setOverdue(Double overdue) {
        this.overdue = overdue;
    }

    public Double getSolveOd() {
        return solveOd;
    }

    public void setSolveOd(Double solveOd) {
        this.solveOd = solveOd;
    }

    public Integer getCbc() {
        return cbc;
    }

    public void setCbc(Integer cbc) {
        this.cbc = cbc;
    }

    public Integer getScbc() {
        return scbc;
    }

    public void setScbc(Integer scbc) {
        this.scbc = scbc;
    }

    public Double getSalaryColl() {
        return salaryColl;
    }

    public void setSalaryColl(Double salaryColl) {
        this.salaryColl = salaryColl;
    }

    public Double getCollAmount() {
        return collAmount;
    }

    public void setCollAmount(Double collAmount) {
        this.collAmount = collAmount;
    }

    public Integer getNoOfEmi() {
        return noOfEmi;
    }

    public void setNoOfEmi(Integer noOfEmi) {
        this.noOfEmi = noOfEmi;
    }

    public Integer getStEmi() {
        return stEmi;
    }

    public void setStEmi(Integer stEmi) {
        this.stEmi = stEmi;
    }

    public Integer getRbEmi() {
        return rbEmi;
    }

    public void setRbEmi(Integer rbEmi) {
        this.rbEmi = rbEmi;
    }

    public Double getRbPos() {
        return rbPos;
    }

    public void setRbPos(Double rbPos) {
        this.rbPos = rbPos;
    }

    public Double getTotalChrg() {
        return totalChrg;
    }

    public void setTotalChrg(Double totalChrg) {
        this.totalChrg = totalChrg;
    }

    public Double getBounceChargeCue() {
        return bounceChargeCue;
    }

    public void setBounceChargeCue(Double bounceChargeCue) {
        this.bounceChargeCue = bounceChargeCue;
    }

    public Double getLppDue() {
        return lppDue;
    }

    public void setLppDue(Double lppDue) {
        this.lppDue = lppDue;
    }

    public Date getClerance() {
        return clerance;
    }

    public void setClerance(Date clerance) {
        this.clerance = clerance;
    }

    public String getTotalOfcDepo() {
        return totalOfcDepo;
    }

    public void setTotalOfcDepo(String totalOfcDepo) {
        this.totalOfcDepo = totalOfcDepo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getSupervisiorName() {
        return supervisiorName;
    }

    public void setSupervisiorName(String supervisiorName) {
        this.supervisiorName = supervisiorName;
    }

    public String geteReceiptId() {
        return eReceiptId;
    }

    public void seteReceiptId(String eReceiptId) {
        this.eReceiptId = eReceiptId;
    }

    public String getCollectorName() {
        return collectorName;
    }

    public void setCollectorName(String collectorName) {
        this.collectorName = collectorName;
    }

    public String getTcSetlemnt() {
        return tcSetlemnt;
    }

    public void setTcSetlemnt(String tcSetlemnt) {
        this.tcSetlemnt = tcSetlemnt;
    }

    public String getMoneyReceipt() {
        return moneyReceipt;
    }

    public void setMoneyReceipt(String moneyReceipt) {
        this.moneyReceipt = moneyReceipt;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "TrasactionDetail{" +
                "id=" + id +
                ", loanAgreementNo='" + loanAgreementNo + '\'' +
                ", applicationId='" + applicationId + '\'' +
                ", status='" + status + '\'' +
                ", tdCode='" + tdCode + '\'' +
                ", mode='" + mode + '\'' +
                ", flowOrRecovery=" + flowOrRecovery +
                ", secured=" + secured +
                ", branch='" + branch + '\'' +
                ", customerName='" + customerName + '\'' +
                ", basketNo=" + basketNo +
                ", actualBasket=" + actualBasket +
                ", productName='" + productName + '\'' +
                ", pos=" + pos +
                ", solvePos=" + solvePos +
                ", emiAmount=" + emiAmount +
                ", overdue=" + overdue +
                ", solveOd=" + solveOd +
                ", cbc=" + cbc +
                ", scbc=" + scbc +
                ", salaryColl=" + salaryColl +
                ", collAmount=" + collAmount +
                ", noOfEmi=" + noOfEmi +
                ", stEmi=" + stEmi +
                ", rbEmi=" + rbEmi +
                ", rbPos=" + rbPos +
                ", totalChrg=" + totalChrg +
                ", bounceChargeCue=" + bounceChargeCue +
                ", lppDue=" + lppDue +
                ", clerance=" + clerance +
                ", totalOfcDepo='" + totalOfcDepo + '\'' +
                ", amount=" + amount +
                ", supervisiorName='" + supervisiorName + '\'' +
                ", eReceiptId='" + eReceiptId + '\'' +
                ", collectorName='" + collectorName + '\'' +
                ", tcSetlemnt='" + tcSetlemnt + '\'' +
                ", moneyReceipt='" + moneyReceipt + '\'' +
                '}';
    }
}
