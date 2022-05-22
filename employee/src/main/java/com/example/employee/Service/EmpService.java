package com.example.employee.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.employee.Dao.EmpRepository;
import com.example.employee.Pojo.employee_pojo;


@Component
public class EmpService {

	@Autowired
	private EmpRepository emp;
	
	public List<employee_pojo> getAll() {
		
		List<employee_pojo> list=(List<employee_pojo>) this.emp.findAll();
		Collections.sort(list, (d1,d2) -> Double.compare(d2.getSalary(),d1.getSalary()));
		return list;
	
}
	public employee_pojo update(employee_pojo pojo) {
		employee_pojo alpha;
		Optional<employee_pojo> empi=emp.findById(pojo.getId());
		
		alpha=empi.get();
		alpha.setSalary(pojo.getSalary());
		emp.save(alpha);
		
		return alpha;
	}
	public Optional<employee_pojo> repo(int id) {
		return null;
	}
}
	

