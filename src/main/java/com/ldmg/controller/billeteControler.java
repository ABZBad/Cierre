package com.ldmg.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ldmg.model.Billete;
import com.ldmg.service.billeteService;

@RestController	
@RequestMapping("/billete")
public class billeteControler {
	 @Autowired
	 billeteService billeteservice;	
	 
	 @GetMapping()
	 public ArrayList<Billete> obtenerBilletes(){
		 return billeteservice.obtenerBilletes();
	 }
	 
	 
}
