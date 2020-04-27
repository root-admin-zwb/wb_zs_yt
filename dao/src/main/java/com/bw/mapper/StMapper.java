package com.bw.mapper;

import com.bw.pojo.St;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StMapper {
    List findAll();

    List type(Integer tid);

    List findtwo(String stype);

    List typetwo(@Param("tid")Integer tid,@Param("stype") String stype);

    void add(St st);

    void del(Integer sid);
}
