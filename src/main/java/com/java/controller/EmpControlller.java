package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.entity.Emp;
import com.java.service.EmpService;

@RestController
public class EmpControlller {
	@Autowired
	private EmpService service;

	public EmpService getService() {
		return service;
	}

	public void setService(EmpService service) {
		this.service = service;
	}
	
	
	@DeleteMapping("/emp")
	public void getDeleteById(@RequestParam long id) {
		
		service.getDeletedingSingleRecords(id);
	}
	
	
	@PostMapping("/emp")
	public void getInsertingValue(@RequestBody Emp emp) {
		
		service.InsertingValue(emp);
		
	}
	
	
	@PostMapping("/emps")
	public void getSaveAll(@RequestBody List<Emp>emps) {
		
		service.getInsertingMulitpleRecords(emps);
	}
	
	
	
	@GetMapping("/all")
	public List<Emp>getAllRecords(){
		
		List<Emp> emps=service.findAllRecords();
		emps.forEach(emp->{
			System.out.println(emp);
		});
		
		return emps;
	}
	
	@GetMapping("/emp/{id}")
	public void getPrintingSingleRecord(@PathVariable long id) {
		
		service.getSingleRecords(id);
	}
	
	@DeleteMapping("all")
	public void getDeletedAllRecords() {
		
		service.getDeletedAllRecords();
	}
	

}
