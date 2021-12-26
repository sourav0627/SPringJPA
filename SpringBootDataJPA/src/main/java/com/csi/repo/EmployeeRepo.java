package com.csi.repo;

import com.csi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    public Employee findByEmpName(String empName);

    public  Employee findByEmpEmailId(String empEmailID);



}
