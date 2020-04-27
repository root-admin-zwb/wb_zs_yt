package com.bw.service;

import com.bw.pojo.St;

import java.util.List;

public interface StService {
    List findAll();

    List type(Integer tid);

    List findtwo(String stype);

    List typetwo(Integer tid, String stype);

    void add(St st);

    void del(Integer sid);
}
