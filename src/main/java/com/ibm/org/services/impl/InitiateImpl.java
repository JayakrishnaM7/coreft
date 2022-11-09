package com.ibm.org.services.impl;
 
import java.util.*;
 
import com.ibm.org.model.InitiateP;
import com.ibm.org.model.InitiateResponseWrapper;
import com.ibm.org.services.InitiateI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class InitiateImpl implements InitiateI {
 
    private static final Log logger = LogFactory.getLog(InitiateImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public InitiateResponseWrapper execute(InitiateP requestParams){
        //TODO
        return new InitiateResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
