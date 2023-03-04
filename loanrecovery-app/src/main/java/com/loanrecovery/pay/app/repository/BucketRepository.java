package com.loanrecovery.pay.app.repository;

import com.loanrecovery.pay.app.model.Bucket0;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BucketRepository extends JpaRepository<Bucket0,Long>, JpaSpecificationExecutor<Bucket0> {
}
