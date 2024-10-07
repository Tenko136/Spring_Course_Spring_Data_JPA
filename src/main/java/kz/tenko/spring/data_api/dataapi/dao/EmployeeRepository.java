package kz.tenko.spring.data_api.dataapi.dao;


import kz.tenko.spring.data_api.dataapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);
}





