package com.ldmg.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldmg.model.Billete;
import com.ldmg.repository.billeteRepository;

@Service
public class billeteService {
	@Autowired
	billeteRepository billeterepo;
	
	public ArrayList<Billete> obtenerBilletes(){
		return (ArrayList<Billete>) billeterepo.findAll();
	}
	public Billete guardarBillete(Billete billete) {
		return billeterepo.save(billete);
	}

}
