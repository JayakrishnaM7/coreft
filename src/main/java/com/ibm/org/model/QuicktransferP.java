package com.ibm.org.model;

import com.ibm.org.model.FtquicktransferRq;
import org.springframework.http.ResponseEntity;
import com.ibm.org.model.FtquicktransferRs;

public class QuicktransferP {

    private FtquicktransferRq ftquicktransferRq;

    public QuicktransferP() {

    }

    public QuicktransferP(FtquicktransferRq ftquicktransferRq) {
        this.ftquicktransferRq = ftquicktransferRq;
    }

    public FtquicktransferRq getFtquicktransferRq () {
        return ftquicktransferRq;
    }

    public void setFtquicktransferRq (FtquicktransferRq ftquicktransferRq) {
        this.ftquicktransferRq = ftquicktransferRq;
    }

}
