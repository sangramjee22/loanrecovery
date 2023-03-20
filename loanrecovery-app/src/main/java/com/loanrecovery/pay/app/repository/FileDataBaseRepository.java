package com.loanrecovery.pay.app.repository;

import com.loanrecovery.pay.app.model.FileDataBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDataBaseRepository extends JpaRepository<FileDataBase,Long> {
}
