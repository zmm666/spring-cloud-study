package com.zmm.domain;

import javax.persistence.Table;

@Table(name = "teacher")
public class TeacherInfo {

    private String tId;

    private String tName;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }
}