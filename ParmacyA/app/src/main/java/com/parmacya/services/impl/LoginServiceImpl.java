package com.parmacya.services.impl;

import com.parmacya.repositories.RestAPILogin;
import com.parmacya.repositories.rest.RestLoginAPI;
import com.parmacya.services.LoginService;

/**
 * Created by SONY on 2016-08-23.
 */
public class LoginServiceImpl implements LoginService {
    final RestAPILogin rest = new RestLoginAPI();
    @Override
    public boolean loginUser(String username, String password) {
        return rest.loginUser(username,password);
    }
}
