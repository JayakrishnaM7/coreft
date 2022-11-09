package com.ibm.org.services.impl;

import java.util.*;
import com.ibm.org.model.QuicktransferP;
import com.ibm.org.model.QuicktransferResponseWrapper;
import com.ibm.org.services.QuicktransferI;
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class QuicktransferImpl implements QuicktransferI {

    private static final Log logger = LogFactory.getLog(QuicktransferImpl.class);

    /**
     * This method includes the business logic for the API implementation
     */
    @Override
    @CircuitBreaker(name = "mainService", fallbackMethod = "fallback")
    public QuicktransferResponseWrapper execute(QuicktransferP requestParams) {
        // TODO
        return new QuicktransferResponseWrapper();
    }

    public <T> T error(int statusCode, Class<T> type, Exception exception) throws InstantiationException, IllegalAccessException {
        // TODO to write error response //NOSONAR
        return type.newInstance();
    }

    public QuicktransferResponseWrapper fallback(QuicktransferP pojo, Throwable exception) {
        logger.info("fallback method triggered with exception : " + exception.getMessage());
        return new QuicktransferResponseWrapper();
    }
}
