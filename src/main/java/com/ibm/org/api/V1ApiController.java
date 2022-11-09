package com.ibm.org.api;

import com.ibm.org.model.FtRq;
import com.ibm.org.model.FtRs;
import com.ibm.org.model.FtquicktransferRq;
import com.ibm.org.model.FtquicktransferRs;
import com.ibm.org.model.FtrepeatRq;
import com.ibm.org.model.FtrepeatRs;
import com.ibm.org.model.FtselftransferRq;
import com.ibm.org.model.FtselftransferRs;
import com.ibm.org.model.HTTPError;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.ibm.org.services.InitiateI;
import com.ibm.org.model.InitiateP;
import com.ibm.org.model.InitiateResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.ibm.org.services.RepeatI;
import com.ibm.org.model.RepeatP;
import com.ibm.org.model.RepeatResponseWrapper;
import com.ibm.org.services.SelftransferI;
import com.ibm.org.model.SelftransferP;
import com.ibm.org.model.SelftransferResponseWrapper;
import com.ibm.org.services.QuicktransferI;
import com.ibm.org.model.QuicktransferP;
import com.ibm.org.model.QuicktransferResponseWrapper;

@RestController
public class V1ApiController implements V1Api {

	@Autowired
	QuicktransferI quicktransferI;


	@Autowired
	SelftransferI selftransferI;


	@Autowired
	RepeatI repeatI;


	@Autowired
	InitiateI initiateI;


    public ResponseEntity<FtRs> initiate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FtRq ftRq){
        
        InitiateResponseWrapper res  = initiateI.execute(new InitiateP(ftRq));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<FtquicktransferRs> quicktransfer(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FtquicktransferRq ftquicktransferRq){
        
        QuicktransferResponseWrapper res  = quicktransferI.execute(new QuicktransferP(ftquicktransferRq));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<FtrepeatRs> repeat(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FtrepeatRq ftrepeatRq){
        
        RepeatResponseWrapper res  = repeatI.execute(new RepeatP(ftrepeatRq));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<FtselftransferRs> selftransfer(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FtselftransferRq ftselftransferRq){
        
        SelftransferResponseWrapper res  = selftransferI.execute(new SelftransferP(ftselftransferRq));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}
