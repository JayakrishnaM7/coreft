package com.ibm.org.services;

import com.ibm.org.model.QuicktransferP;
import com.ibm.org.model.QuicktransferResponseWrapper;

public interface QuicktransferI {

    public QuicktransferResponseWrapper execute(QuicktransferP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
