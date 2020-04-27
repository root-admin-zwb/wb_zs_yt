package com.bw.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bw.mapper.StMapper;
import com.bw.pojo.St;
import com.bw.service.StService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class StServiceImpl implements StService {

    @Autowired
    private StMapper stMapper;

    @Override
    public List findAll() {
        return stMapper.findAll();
    }

    @Override
    public List type(Integer tid) {
        return stMapper.type(tid);
    }

    @Override
    public List findtwo(String stype) {

        return stMapper.findtwo(stype);
    }

    @Override
    public List typetwo(Integer tid, String stype) {
        return stMapper.typetwo(tid,stype);
    }

    @Override
    public void add(St st) {
        stMapper.add(st);
    }

    @Override
    public void del(Integer sid) {
        stMapper.del(sid);
    }
}
