package com.parmacya.repositories;

import java.util.List;

/**
 * Created by SONY on 2016-08-23.
 */
public interface RestAPI<S, ID> {
    S get(ID id);

    String post(S entity);

    String put(S entity);

    String delete(S entity);

    List<S> getAll();
}
