package com.ibm.org.exception;

import java.util.HashMap;
import java.util.Map;

import com.ibm.org.exception.ApiExceptionResponse;
import com.ibm.org.exception.ErrorStatusCode;
import com.ibm.org.model.*;

public class MetaData {

	public static final Map<String,Map<ErrorStatusCode, ApiExceptionResponse>> apiExceptions;
	
	static {		
		apiExceptions = new HashMap<String,Map<ErrorStatusCode, ApiExceptionResponse>>();

		Map<ErrorStatusCode, ApiExceptionResponse> responses; 
		try {
		
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,HTTPError.class,"Bad Request"));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,HTTPError.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,HTTPError.class,"Forbidden"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,HTTPError.class,"Not Found"));
		 responses.put(ErrorStatusCode.getStatusCode(429),ApiExceptionResponse.getInstance(429,HTTPError.class,"Too Many Requests"));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,HTTPError.class,"Internal Server Error"));
		 
		 apiExceptions.put("initiate",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,HTTPError.class,"Bad Request"));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,HTTPError.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,HTTPError.class,"Forbidden"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,HTTPError.class,"Not Found"));
		 responses.put(ErrorStatusCode.getStatusCode(429),ApiExceptionResponse.getInstance(429,HTTPError.class,"Too Many Requests"));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,HTTPError.class,"Internal Server Error"));
		 
		 apiExceptions.put("repeat",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,HTTPError.class,"Bad Request"));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,HTTPError.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,HTTPError.class,"Forbidden"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,HTTPError.class,"Not Found"));
		 responses.put(ErrorStatusCode.getStatusCode(429),ApiExceptionResponse.getInstance(429,HTTPError.class,"Too Many Requests"));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,HTTPError.class,"Internal Server Error"));
		 
		 apiExceptions.put("selftransfer",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,HTTPError.class,"Bad Request"));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,HTTPError.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,HTTPError.class,"Forbidden"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,HTTPError.class,"Not Found"));
		 responses.put(ErrorStatusCode.getStatusCode(429),ApiExceptionResponse.getInstance(429,HTTPError.class,"Too Many Requests"));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,HTTPError.class,"Internal Server Error"));
		 
		 apiExceptions.put("quicktransfer",responses);
		 
		
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
