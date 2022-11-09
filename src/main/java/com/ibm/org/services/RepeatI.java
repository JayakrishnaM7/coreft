package com.ibm.org.services;

import com.ibm.org.model.RepeatP;
import com.ibm.org.model.RepeatResponseWrapper;

public interface RepeatI {

    public RepeatResponseWrapper execute(RepeatP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
