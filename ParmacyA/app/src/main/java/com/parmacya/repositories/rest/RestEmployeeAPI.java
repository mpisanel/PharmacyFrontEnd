package com.parmacya.repositories.rest;

import com.parmacya.model.Employee;
import com.parmacya.repositories.RestAPI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SONY on 2016-08-23.
 */
public class RestEmployeeAPI implements RestAPI<Employee, Long> {
    final String BASE_URL="http://localhost//emp/";
    final HttpHeaders requestHeaders = RestMethods.getHeaders();
    final RestTemplate restTemplate = RestMethods.getRestTemplate();

    @Override
    public Employee get(Long id) {
        final String url = BASE_URL+"employee/"+id.toString();
        HttpEntity<Employee> requestEntity = new HttpEntity<Employee>(requestHeaders);
        ResponseEntity<Employee> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Employee.class);
        Employee employee = responseEntity.getBody();
        return employee;
    }

    @Override
    public String post(Employee entity) {
        final String url = BASE_URL+"employee/create";
        HttpEntity<Employee> requestEntity = new HttpEntity<Employee>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(Employee entity) {
        final String url = BASE_URL+"employee/update/"+entity.getId().toString();
        HttpEntity<Employee> requestEntity = new HttpEntity<Employee>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String delete(Employee entity) {
        final String url = BASE_URL+"employee/delete/"+entity.getId().toString();
        HttpEntity<Employee> requestEntity = new HttpEntity<Employee>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        return responseEntity.getBody();
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        final String url = BASE_URL+"employees/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<Employee[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Employee[].class);
        Employee[] results = responseEntity.getBody();

        for (Employee employee : results) {
            employees.add(employee);
        }
        return employees;
    }
}
