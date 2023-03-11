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
@Table(name = "Login")
public class Login {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "login_id", nullable = false)
    @Size(min =5, max=50)
    private String loginId;

    @Column(name = "password", length = 64,unique = true, nullable = false)
    @Size(max=256)
    private String password;

    @Column(name = "token", length = 2048,unique = true, nullable = false)
    private String token;

}
