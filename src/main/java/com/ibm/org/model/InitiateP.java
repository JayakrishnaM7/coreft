package com.ibm.org.model;

import com.ibm.org.model.FtRq;
import org.springframework.http.ResponseEntity;
import com.ibm.org.model.FtRs;

public class InitiateP {

    private FtRq ftRq;

    public InitiateP() {

    }

    public InitiateP(FtRq ftRq) {
        this.ftRq = ftRq;
    }

    public FtRq getFtRq () {
        return ftRq;
    }

    public void setFtRq (FtRq ftRq) {
        this.ftRq = ftRq;
    }

}
