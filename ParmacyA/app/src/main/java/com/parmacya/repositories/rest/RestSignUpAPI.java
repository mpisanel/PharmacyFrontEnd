package com.parmacya.repositories.rest;

import com.parmacya.model.User;
import com.parmacya.repositories.RestAPISignup;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by SONY on 2016-08-23.
 */
public class RestSignUpAPI implements RestAPISignup {
    final String BASE_URL="http://localhost//signup/";

    final HttpHeaders requestHeaders = RestMethods.getHeaders();
    final RestTemplate restTemplate = RestMethods.getRestTemplate();

    @Override
    public String signUp_User(User entity) {
        //DIRECT URL TO THIS SERVICE (API) ON BACKEND
        final String url = BASE_URL+"user/";
        //CREATES READ/WRITE OBJECT
        HttpEntity<User> requestEntity = new HttpEntity<User>(entity, requestHeaders);

        try {
            //WRITES TO THE BACKED
            ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
            //GETS RESPONSE FROM BACKED
            String result = responseEntity.getBody();
            return result;
        }catch (Exception e)
        {
            return "Exists";
        }
    }
}
