package com.loanrecovery.pay.app.dto;

import com.loanrecovery.pay.app.model.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Builder
public class UserDto {
    private Long id;
    private String loginName;

    private String name;

    private String email;

    private Long phoneNo;

    private String address;

    private String department;

    private String alternatePhoneNo;

    private String bucket;

    private Number pos;

    private Number spos;

    private Number cbc;

    private Number emi;

    private Number emiCollectedAmount;

    private Number rollBack;

    private Number settlementAmount;

    private Number collectionAmount;

    private Number noOfEmi;

    private Number normalization;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDto)) return false;
        UserDto userDto = (UserDto) o;
        return Objects.equals(getId(), userDto.getId()) && Objects.equals(getLoginName(), userDto.getLoginName()) && Objects.equals(getName(), userDto.getName()) && Objects.equals(getEmail(), userDto.getEmail()) && Objects.equals(getPhoneNo(), userDto.getPhoneNo()) && Objects.equals(getAddress(), userDto.getAddress()) && Objects.equals(getDepartment(), userDto.getDepartment()) && Objects.equals(getAlternatePhoneNo(), userDto.getAlternatePhoneNo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLoginName(), getName(), getEmail(), getPhoneNo(), getAddress(), getDepartment(), getAlternatePhoneNo());
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo=" + phoneNo +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                ", alternatePhoneNo='" + alternatePhoneNo + '\'' +
                '}';
    }
}
