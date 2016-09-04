package com.parmacya.services.impl;

import com.parmacya.model.Employee;
import com.parmacya.repositories.RestAPI;
import com.parmacya.repositories.rest.RestEmployeeAPI;
import com.parmacya.services.EmployeeService;

import java.util.List;

/**
 * Created by SONY on 2016-08-23.
 */
public class EmployeeServiceImpl implements EmployeeService {

    final RestAPI<Employee,Long> rest = new RestEmployeeAPI();

    @Override
    public Employee findById(Long id) {
        return rest.get(id);
    }

    @Override
    public String save(Employee entity) {
        return rest.post(entity);
    }

    @Override
    public String update(Employee entity) {
        return rest.put(entity);
    }

    @Override
    public String delete(Employee entity) {
        return rest.delete(entity);
    }

    @Override
    public List<Employee> findAll() {
        return rest.getAll();
    }
}
