package com.ibm.org.services;

import com.ibm.org.model.InitiateP;
import com.ibm.org.model.InitiateResponseWrapper;

public interface InitiateI {

    public InitiateResponseWrapper execute(InitiateP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
