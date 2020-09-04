package com.zmm.domain;

import javax.persistence.Table;

@Table(name = "student")
public class StudentInfo {
    private String sId;

    private String sName;

    private String sBirth;

    private String sSex;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId == null ? null : sId.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsBirth() {
        return sBirth;
    }

    public void setsBirth(String sBirth) {
        this.sBirth = sBirth == null ? null : sBirth.trim();
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex == null ? null : sSex.trim();
    }
}