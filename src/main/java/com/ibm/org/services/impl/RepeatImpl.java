package com.ibm.org.services.impl;

import java.util.*;
import com.ibm.org.model.RepeatP;
import com.ibm.org.model.RepeatResponseWrapper;
import com.ibm.org.services.RepeatI;
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class RepeatImpl implements RepeatI {

    private static final Log logger = LogFactory.getLog(RepeatImpl.class);

    /**
     * This method includes the business logic for the API implementation
     */
    @Override
    @CircuitBreaker(name = "mainService", fallbackMethod = "fallback")
    public RepeatResponseWrapper execute(RepeatP requestParams) {
        // TODO
        return new RepeatResponseWrapper();
    }

    public <T> T error(int statusCode, Class<T> type, Exception exception) throws InstantiationException, IllegalAccessException {
        // TODO to write error response //NOSONAR
        return type.newInstance();
    }

    public RepeatResponseWrapper fallback(RepeatP pojo, Throwable exception) {
        logger.info("fallback method triggered with exception : " + exception.getMessage());
        return new RepeatResponseWrapper();
    }
}
