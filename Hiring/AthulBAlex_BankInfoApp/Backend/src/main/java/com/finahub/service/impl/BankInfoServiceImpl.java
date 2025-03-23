package com.finahub.service.impl;

import org.springframework.stereotype.Service;

import com.finahub.entities.BankInfo;
import com.finahub.repo.BankInfoRepository;
import com.finahub.service.BankInfoService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BankInfoServiceImpl implements  BankInfoService{
	
	private final BankInfoRepository repo;


	@Override
	public BankInfo saveBankInfo(BankInfo bankInfo) {
		
		 return repo.save(bankInfo);
	}

}
