package com.ibm.org.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import com.ibm.org.model.FtquicktransferRq;
import org.springframework.http.ResponseEntity;
import com.ibm.org.model.FtquicktransferRs;


public class QuicktransferResponseWrapper {

	private FtquicktransferRs response;
        
        private MultiValueMap<String,String> headers = new LinkedMultiValueMap<>();

        public MultiValueMap<String, String> getHeaders(){
            return this.headers;
	}

	public void setHeaders(MultiValueMap<String,String> headers){
            this.headers = headers;
	}
        
        public void addHeaders(String header, List<String> value) {
            headers.put(header, value);
        }
 
	public FtquicktransferRs getResponse(){
            return response;
	}
 
	public void setResponse(FtquicktransferRs response){
            this.response=response;
	}  
}
