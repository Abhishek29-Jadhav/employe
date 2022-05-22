package com.example.employee.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.Pojo.employee_pojo; 
import com.example.employee.Service.EmpService;


@RestController
public class empController {

	@Autowired
	private EmpService empservice;
	
	@GetMapping("Employee")
	public List<employee_pojo> getsalary(){
		List<employee_pojo> list=empservice.getAll();
		return list;
	}
	
	@PutMapping("Employee_Salary")
	public employee_pojo update(@RequestBody employee_pojo pojo) {
		return empservice.update(pojo);
	}
	
	@GetMapping("Employeesalary/{id}")
	public Optional<employee_pojo> emp2(@PathVariable("id") int id) {
		Optional<employee_pojo> obj1=empservice.repo(id);
		return obj1;
	}
	}
