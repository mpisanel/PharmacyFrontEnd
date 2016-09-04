package com.parmacya.repositories.rest;

import com.parmacya.model.User;
import com.parmacya.repositories.RestAPILogin;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by SONY on 2016-08-23.
 */
public class RestLoginAPI implements RestAPILogin {
    final String BASE_URL="http://locahost//login/";
    final HttpHeaders requestHeaders = RestMethods.getHeaders();
    final RestTemplate restTemplate = RestMethods.getRestTemplate();
    @Override
    public boolean loginUser(String username, String password) {
        final String url = BASE_URL+"user/"+username.toString() +"/"+password.toString();
        HttpEntity<User> requestEntity = new HttpEntity<User>(requestHeaders);
        try {
            ResponseEntity<User> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, User.class);
            User user = responseEntity.getBody();

            if (user != null)
                return false;
            else
                return true;
        }catch(Exception e)
        {
            return false;
        }
    }
}
