package com.finahub.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finahub.entities.BankInfo;
import com.finahub.repo.BankInfoRepository;
import com.finahub.service.BankInfoService;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/api/bankinfo")
public class BankInfoController {
	
	@Autowired
    private BankInfoRepository repo;

    private final BankInfoService service;

    public BankInfoController(BankInfoService service) {
        this.service = service;
    }
    @GetMapping("/bankinfo")
    public ResponseEntity<?> getAllBankInfo() {
        return ResponseEntity.ok(repo.findAll());
    }


    @PostMapping
    public ResponseEntity<Map<String, String>> saveBankInfo(@RequestBody BankInfo bankInfo) {
        
    	service.saveBankInfo(bankInfo);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Data saved successfully!");
        return ResponseEntity.ok(response);
    }
}
