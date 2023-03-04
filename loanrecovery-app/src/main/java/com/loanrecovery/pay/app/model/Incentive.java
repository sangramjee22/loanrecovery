package com.loanrecovery.pay.app.model;

import javax.persistence.*;

@Entity
@Table(name = "incentive")
public class Incentive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(name = "AGENT_NAME", nullable = false)
    private String agentName;
    @Column(name = "LOAN_AGREE_NO", nullable = false)
    private String loanAgreementNo;
    @Column(name = "APPLICATION_ID", nullable = false)
    private String appId;
    @Column(name = "RECOVERY_STATUS", nullable = false)
    private String recoveryStatus;
    @Column(name = "MODE_OF_PAYMNT", nullable = false)
    private String modeOfPaymnt;
    @Column(name = "BKT_ID", nullable = false)
    private Integer basketId;
    @Column(name = "POS", nullable = false)
    private Long pos;
    @Column(name = "SPOS", nullable = false)
    private Long spos;
    @Column(name = "EMI_AMOUNT", nullable = false)
    private Long emiAmount;
    @Column(name = "CASE_ASSIGN", nullable = false)
    private Integer caseAssign;
    @Column(name = "CASE_RESOLVED", nullable = false)
    private Integer caseResolved;
    @Column(name = "TL_NAME", nullable = false)
    private String tlName;
    @Column(name = "BRANCH", nullable = false)
    private String branch;
    @Column(name = "PROD_CODE", nullable = false)
    private String productCde;
    @Column(name = "RB_COUNT", nullable = false)
    private Integer rollBackCount;
    @Column(name = "COLLECTED_AMT", nullable = false)
    private Long collectedAmount;
    @Column(name = "CBC_COUNT", nullable = false)
    private Long cbcCount;


    public Incentive(Long id, String agentName, String loanAgreementNo,
                     String appId, String recoveryStatus, String modeOfPaymnt,
                     Integer basketId, Long pos, Long spos, Long emiAmount,
                     Integer caseAssign, Integer caseResolved, String tlName,
                     String branch, String productCde, Integer rollBackCount,
                     Long collectedAmount, Long cbcCount)
    {
        this.id = id;
        this.agentName = agentName;
        this.loanAgreementNo = loanAgreementNo;
        this.appId = appId;
        this.recoveryStatus = recoveryStatus;
        this.modeOfPaymnt = modeOfPaymnt;
        this.basketId = basketId;
        this.pos = pos;
        this.spos = spos;
        this.emiAmount = emiAmount;
        this.caseAssign = caseAssign;
        this.caseResolved = caseResolved;
        this.tlName = tlName;
        this.branch = branch;
        this.productCde = productCde;
        this.rollBackCount = rollBackCount;
        this.collectedAmount = collectedAmount;
        this.cbcCount = cbcCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getLoanAgreementNo() {
        return loanAgreementNo;
    }

    public void setLoanAgreementNo(String loanAgreementNo) {
        this.loanAgreementNo = loanAgreementNo;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getRecoveryStatus() {
        return recoveryStatus;
    }

    public void setRecoveryStatus(String recoveryStatus) {
        this.recoveryStatus = recoveryStatus;
    }

    public String getModeOfPaymnt() {
        return modeOfPaymnt;
    }

    public void setModeOfPaymnt(String modeOfPaymnt) {
        this.modeOfPaymnt = modeOfPaymnt;
    }

    public Integer getBasketId() {
        return basketId;
    }

    public void setBasketId(Integer basketId) {
        this.basketId = basketId;
    }

    public Long getPos() {
        return pos;
    }

    public void setPos(Long pos) {
        this.pos = pos;
    }

    public Long getSpos() {
        return spos;
    }

    public void setSpos(Long spos) {
        this.spos = spos;
    }

    public Long getEmiAmount() {
        return emiAmount;
    }

    public void setEmiAmount(Long emiAmount) {
        this.emiAmount = emiAmount;
    }

    public Integer getCaseAssign() {
        return caseAssign;
    }

    public void setCaseAssign(Integer caseAssign) {
        this.caseAssign = caseAssign;
    }

    public Integer getCaseResolved() {
        return caseResolved;
    }

    public void setCaseResolved(Integer caseResolved) {
        this.caseResolved = caseResolved;
    }

    public String getTlName() {
        return tlName;
    }

    public void setTlName(String tlName) {
        this.tlName = tlName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getProductCde() {
        return productCde;
    }

    public void setProductCde(String productCde) {
        this.productCde = productCde;
    }

    public Integer getRollBackCount() {
        return rollBackCount;
    }

    public void setRollBackCount(Integer rollBackCount) {
        this.rollBackCount = rollBackCount;
    }

    public Long getCollectedAmount() {
        return collectedAmount;
    }

    public void setCollectedAmount(Long collectedAmount) {
        this.collectedAmount = collectedAmount;
    }

    public Long getCbcCount() {
        return cbcCount;
    }

    public void setCbcCount(Long cbcCount) {
        this.cbcCount = cbcCount;
    }

    @Override
    public String toString() {
        return "Incentive{" +
                "id=" + id +
                ", agentName='" + agentName + '\'' +
                ", loanAgreementNo='" + loanAgreementNo + '\'' +
                ", appId='" + appId + '\'' +
                ", recoveryStatus='" + recoveryStatus + '\'' +
                ", modeOfPaymnt='" + modeOfPaymnt + '\'' +
                ", basketId=" + basketId +
                ", pos=" + pos +
                ", spos=" + spos +
                ", emiAmount=" + emiAmount +
                ", caseAssign=" + caseAssign +
                ", caseResolved=" + caseResolved +
                ", tlName='" + tlName + '\'' +
                ", branch='" + branch + '\'' +
                ", productCde='" + productCde + '\'' +
                ", rollBackCount=" + rollBackCount +
                ", collectedAmount=" + collectedAmount +
                ", cbcCount=" + cbcCount +
                '}';
    }
}
