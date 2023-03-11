package com.loanrecovery.pay.app.repository;

import com.loanrecovery.pay.app.dto.AuthenticationSuccess;
import com.loanrecovery.pay.app.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LoginRepository extends JpaRepository<Login,Long>, JpaSpecificationExecutor<Login> {

    public Login findByLoginId(String loginName);
}
