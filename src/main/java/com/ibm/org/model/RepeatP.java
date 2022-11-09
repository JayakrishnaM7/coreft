package com.ibm.org.model;

import com.ibm.org.model.FtrepeatRq;
import org.springframework.http.ResponseEntity;
import com.ibm.org.model.FtrepeatRs;

public class RepeatP {

    private FtrepeatRq ftrepeatRq;

    public RepeatP() {

    }

    public RepeatP(FtrepeatRq ftrepeatRq) {
        this.ftrepeatRq = ftrepeatRq;
    }

    public FtrepeatRq getFtrepeatRq () {
        return ftrepeatRq;
    }

    public void setFtrepeatRq (FtrepeatRq ftrepeatRq) {
        this.ftrepeatRq = ftrepeatRq;
    }

}
