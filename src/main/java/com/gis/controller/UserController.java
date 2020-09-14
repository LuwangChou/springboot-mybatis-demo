package com.gis.controller;

import com.alibaba.fastjson.JSON;
import com.gis.entity.User;
import com.gis.service.UserService;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2020/9/14.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public String getUser(@RequestParam(value="userid",required = true) int userid,
                          @RequestParam(value="attributeid",required = true) int attributeid){
        String resultString = userService.Sel(userid,attributeid).toString();
        System.out.println(resultString);
        return resultString;
    }

    /**
     * map的value为java类
     * @return
     */
    @RequestMapping("/selAllMapUser")
    public String selAllHashMapUser(){
        Map<Long,User> hashMapUser = userService.SelAllMapUser();
        String resultString = "";
//        int size = hashMapUser.size();

//        for( Map.Entry<Long,User> entry: hashMapUser.entrySet()){
//            resultString += entry.getValue().toString();
//        }
        resultString = JSON.toJSONString(hashMapUser);
        System.out.println(resultString);
        return resultString;
    }

    /**
     *
     * @param attributeid
     * @return
     */
    @RequestMapping("/getAttribute")
    public String getAttribute(@RequestParam(value="attributeid",required = true) int attributeid){
        String resultString = userService.SelAttribute(attributeid).toString();
        System.out.println(resultString);
        return resultString;
    }


    /**
     * map的value为map
     * @return
     */
    @RequestMapping("/selAllMapValueMapUser")
    public String selAllMapValueMapUser(){
        Map<Long,Map<String,User>> hashMapValueMapUser = userService.selAllMapValueMapUser();
        String resultString = "";
//        int size = hashMapUser.size();

//        for( Map.Entry<Long,User> entry: hashMapUser.entrySet()){
//            resultString += entry.getValue().toString();
//        }
        resultString = JSON.toJSONString(hashMapValueMapUser);
        System.out.println(resultString);
        return resultString;
    }



}
