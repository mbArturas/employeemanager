package com.mbarturas.employeemanager.repo;

import com.mbarturas.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository <Employee, Long> {
}
