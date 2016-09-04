package com.parmacya.services;

import java.util.List;

/**
 * Created by SONY on 2016-08-23.
 */
public interface Services<S, ID> {
    public S findById(ID id);

    public String save(S entity);

    public String update(S entity);

    public String delete(S entity);

    public List<S> findAll();
}

