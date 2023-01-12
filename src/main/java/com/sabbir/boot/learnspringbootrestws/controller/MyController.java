package com.sabbir.boot.learnspringbootrestws.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyController {
	
	@Autowired
	BusinessClass bClass;
	
	public long returnValue() {
		return bClass.calculateSum();
	}
}

@Component
class BusinessClass{
	
	@Autowired
	DataClass dClass;
	
	public long calculateSum() {
		return dClass.setData().stream().reduce(Integer::sum).get();
	}
	
}

@Component
class DataClass {
	
	public List<Integer> setData(){
		return Arrays.asList(23,34,56,87,90);
	}
}