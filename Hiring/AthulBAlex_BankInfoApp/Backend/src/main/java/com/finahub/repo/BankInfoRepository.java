package com.finahub.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finahub.entities.BankInfo;

public interface BankInfoRepository extends JpaRepository<BankInfo, Long>{

}
