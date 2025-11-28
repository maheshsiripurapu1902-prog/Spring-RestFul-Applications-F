package com.java.service;

import java.util.List;

import com.java.entity.Emp;

public interface EmpService {
	
	public void InsertingValue(Emp emp);
	
	public void getInsertingMulitpleRecords(List<Emp>emps);
	
	
	public List<Emp>findAllRecords();
	
	
	public void getSingleRecords(long id);
	
	public void getDeletedingSingleRecords(long id);
	
	public void getDeletedAllRecords();

}
