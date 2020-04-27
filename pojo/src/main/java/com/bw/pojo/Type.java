package com.bw.pojo;

import java.io.Serializable;

public class Type implements Serializable {

    private Integer tid;
    private String tname;
    private Integer sid;

    public Type() {
    }

    public Type(Integer tid, String tname, Integer sid) {
        this.tid = tid;
        this.tname = tname;
        this.sid = sid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}
