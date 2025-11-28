package com.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.entity.Emp;
import com.java.repo.EmpRepo;

@Service
public class EmpServiceImp implements EmpService {
	
	
	@Autowired
	private EmpRepo repo;

	public EmpRepo getRepo() {
		return repo;
	}

	public void setRepo(EmpRepo repo) {
		this.repo = repo;
	}

	@Override
	public void InsertingValue(Emp emp) {

		repo.save(emp);
	}

	@Override
	public void getInsertingMulitpleRecords(List<Emp> emps) {

	 Iterable<Emp>it=repo.saveAll(emps);
	 it.forEach(emp->{
		 
		 System.out.println(emp);
	 });
		
		
	}

	@Override
	public List<Emp> findAllRecords() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void getSingleRecords(long id) {

		Optional<Emp>op=repo.findById(id);
	
		System.out.println(op);
	}

	@Override
	public void getDeletedingSingleRecords(long id) {

		repo.deleteById(id);
	}

	@Override
	public void getDeletedAllRecords() {

		List<Emp>list=repo.findAll();
		
		repo.deleteAll(list);
	}
	

}
