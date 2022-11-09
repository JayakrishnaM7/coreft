package com.ibm.org.services;

import com.ibm.org.model.SelftransferP;
import com.ibm.org.model.SelftransferResponseWrapper;

public interface SelftransferI {

    public SelftransferResponseWrapper execute(SelftransferP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
