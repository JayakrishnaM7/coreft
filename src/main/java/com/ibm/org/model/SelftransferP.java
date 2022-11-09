package com.ibm.org.model;

import com.ibm.org.model.FtselftransferRq;
import org.springframework.http.ResponseEntity;
import com.ibm.org.model.FtselftransferRs;

public class SelftransferP {

    private FtselftransferRq ftselftransferRq;

    public SelftransferP() {

    }

    public SelftransferP(FtselftransferRq ftselftransferRq) {
        this.ftselftransferRq = ftselftransferRq;
    }

    public FtselftransferRq getFtselftransferRq () {
        return ftselftransferRq;
    }

    public void setFtselftransferRq (FtselftransferRq ftselftransferRq) {
        this.ftselftransferRq = ftselftransferRq;
    }

}
