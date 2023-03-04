package com.loanrecovery.pay.app.dto;

public class AuthenticationSuccess {

    private String successMessage;

    public AuthenticationSuccess(String successMessage) {
        this.successMessage = successMessage;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
    }

    @Override
    public String toString() {
        return String.format("HI [message=%s]", successMessage);
    }
}
