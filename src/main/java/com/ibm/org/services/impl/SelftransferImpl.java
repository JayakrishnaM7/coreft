package com.ibm.org.services.impl;

import java.util.*;
import com.ibm.org.model.SelftransferP;
import com.ibm.org.model.SelftransferResponseWrapper;
import com.ibm.org.services.SelftransferI;
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class SelftransferImpl implements SelftransferI {

    private static final Log logger = LogFactory.getLog(SelftransferImpl.class);

    /**
     * This method includes the business logic for the API implementation
     */
    @Override
    @CircuitBreaker(name = "mainService", fallbackMethod = "fallback")
    public SelftransferResponseWrapper execute(SelftransferP requestParams) {
        // TODO
        return new SelftransferResponseWrapper();
    }

    public <T> T error(int statusCode, Class<T> type, Exception exception) throws InstantiationException, IllegalAccessException {
        // TODO to write error response //NOSONAR
        return type.newInstance();
    }

    public SelftransferResponseWrapper fallback(SelftransferP pojo, Throwable exception) {
        logger.info("fallback method triggered with exception : " + exception.getMessage());
        return new SelftransferResponseWrapper();
    }
}
