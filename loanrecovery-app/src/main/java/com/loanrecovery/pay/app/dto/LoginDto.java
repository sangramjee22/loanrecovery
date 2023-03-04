package com.loanrecovery.pay.app.dto;

import lombok.Builder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Builder
public class LoginDto {

    @Pattern(regexp = "^[a-z0-9A-Z]*$")
    @NotNull
    @Size(min = 5, max = 30)
    private String loginId;
    @NotNull
    @Size(min = 8, max = 15)
    private String password;
    private Boolean rememberMe;

}
