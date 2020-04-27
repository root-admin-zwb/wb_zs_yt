package com.bw.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bw.pojo.St;
import com.bw.service.StService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 作者:张文彬
 * 时间2019-02-18
 * 功能：增删改查，分类查询，逻辑删除，添加
 */
@RestController
@CrossOrigin
public class StController {

    @Reference
    private StService stService;

    @RequestMapping("findAll")//查询所有方法
    public List findAll(){
        return stService.findAll();
    }

    @RequestMapping("type")//根据类型查询
    public List type(@RequestParam("tid")Integer tid,@RequestParam("stype")String stype){

        if(stype.equals("所有题型")){//判断类型
            if (tid==0){
                return stService.findAll();//判断单选还是多选还是所有
            }else {
                return stService.type(tid);
            }
        }else{
            if (tid==0){
                return stService.findtwo(stype);//传入类型并查询
            }else {
                return stService.typetwo(tid,stype);//类型和选择查询
            }
        }
    }

    @RequestMapping("add")//添加
    public String add(@RequestBody St st){
        stService.add(st);
        return "ok";
    }

    @RequestMapping("del")//逻辑删除
    public String del(@RequestParam("sid")Integer sid){
        stService.del(sid);
        return "ok";
    }
}
