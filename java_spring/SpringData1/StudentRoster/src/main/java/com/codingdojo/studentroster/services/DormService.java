package com.codingdojo.studentroster.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.studentroster.models.Contact;
import com.codingdojo.studentroster.models.Dorm;
import com.codingdojo.studentroster.repositories.DormRepository;

@Service

public class DormService {
	
	@Autowired
	private DormRepository dormRepository;

	
//  ----------------------------------------------------------------
//  find all
//  ----------------------------------------------------------------

	public List<Dorm> allDorms() {
		return dormRepository.findAll();
	}
	

//  ----------------------------------------------------------------
//  create 
//  ----------------------------------------------------------------
	
	public Dorm createDorm(Dorm dorm) {
		return dormRepository.save(dorm);
	}
//  ----------------------------------------------------------------
//  find by id 
//  ----------------------------------------------------------------
	
	public Dorm findById(Long id) {
		Optional<Dorm> optionalDorm = dormRepository.findById(id);
		if (optionalDorm.isPresent()) {
			return optionalDorm.get();
		} else {
			return null;
		}
	}
}
