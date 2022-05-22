package com.example.employee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.Pojo.employee_pojo;

public interface EmpRepository extends JpaRepository<employee_pojo,Integer>{

}
