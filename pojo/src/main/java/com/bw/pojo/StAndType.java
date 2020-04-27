package com.bw.pojo;

import java.io.Serializable;

public class StAndType implements Serializable {
    private Integer sid;
    private String sname;
    private String sa;
    private String sb;
    private String sc;
    private String sd;
    private String stype;
    private String send;
    private Integer score;
    private Integer tid;
    private String tname;
    private Integer del;

    public StAndType() {
    }

    public StAndType(Integer sid, String sname, String sa, String sb, String sc, String sd, String stype, String send, Integer score, Integer tid, String tname, Integer del) {
        this.sid = sid;
        this.sname = sname;
        this.sa = sa;
        this.sb = sb;
        this.sc = sc;
        this.sd = sd;
        this.stype = stype;
        this.send = send;
        this.score = score;
        this.tid = tid;
        this.tname = tname;
        this.del = del;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSa() {
        return sa;
    }

    public void setSa(String sa) {
        this.sa = sa;
    }

    public String getSb() {
        return sb;
    }

    public void setSb(String sb) {
        this.sb = sb;
    }

    public String getSc() {
        return sc;
    }

    public void setSc(String sc) {
        this.sc = sc;
    }

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
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
}
