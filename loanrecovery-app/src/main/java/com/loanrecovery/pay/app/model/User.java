package com.loanrecovery.pay.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp_details")
public class User {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "emp_name", nullable = false)
    @Size(min =5, max=50)
    private String name;

    @Pattern(regexp = "[_A-Za-z0-9]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[_A-Za-z0-9]+)*(\\.[A-za-z]{2,})",
            message = "Invalid email address")
    @Column(name = "emp_email", length = 64,unique = true, nullable = false)
    @Size(max=256)
    private String email;
    @Column(name = "emp_age")
    private Long empAge;
    @Column(name = "emp_phone_number")
    private Long phoneNo;
    @Column(name = "emp_permanent_address")
    private String address;
    @Column(name = "emp_staying_address")
    private String stayingAddress;
    @Column(name = "emp_department")
    private String department;
    @Column(name = "emp_alter_contact_number")
    private String alternatePhoneNo;
    @Column(name = "emp_idoroof_type")
    private String idProofType;
    @Column(name = "emp_idoroof_number")
    private String idProofNumber;

}
