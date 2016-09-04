package com.parmacya.services.impl;

import com.parmacya.model.User;
import com.parmacya.repositories.RestAPISignup;
import com.parmacya.repositories.rest.RestSignUpAPI;
import com.parmacya.services.SignupService;
/**
 * Created by SONY on 2016-08-23.
 */
public class SignUpServiceImpl implements SignupService {
    final RestAPISignup rest = new RestSignUpAPI();

    @Override
    public String signUp_User(User entity) {
        return rest.signUp_User(entity);
    }
}
