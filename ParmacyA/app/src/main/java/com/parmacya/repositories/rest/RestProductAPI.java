package com.parmacya.repositories.rest;


import com.parmacya.model.Product;
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
public class RestProductAPI implements RestAPI<Product,Long> {
    final String BASE_URL="http://localhost/product/";
    final HttpHeaders requestHeaders = RestMethods.getHeaders();
    final RestTemplate restTemplate = RestMethods.getRestTemplate();


    @Override
    public Product get(Long id) {
        final String url = BASE_URL+"product/"+id.toString();
        HttpEntity<Product> requestEntity = new HttpEntity<Product>(requestHeaders);
        ResponseEntity<Product> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Product.class);
        Product product = responseEntity.getBody();
        return product;    }

    @Override
    public String post(Product entity) {
        final String url = BASE_URL+"createProduct/";
        HttpEntity<Product> requestEntity = new HttpEntity<Product>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(Product entity) {
        final String url = BASE_URL+"product/update/"+entity.getId().toString();
        HttpEntity<Product> requestEntity = new HttpEntity<Product>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String delete(Product entity) {
        return null;
    }

    @Override
    public List<Product> getAll() {

        List<Product> products = new ArrayList<>();
        final String url = BASE_URL + "view_products/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<Product[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Product[].class);
        Product[] results = responseEntity.getBody();

        for (Product product : results) {
            products.add(product);
        }
        return products;
    }


}
