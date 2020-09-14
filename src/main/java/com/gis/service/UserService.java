package com.gis.service;

import com.gis.entity.Attributes;
import com.gis.entity.User;
import com.gis.mapper.UserMapper;
import org.apache.ibatis.annotations.MapKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2020/9/14.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int userid,int attributeid) {
        return userMapper.Sel(userid,attributeid);
    }
    public Map<Long,User> SelAllMapUser() {
        return userMapper.SelAllMapUser();
    }

    public Map<Long,Map<String,User> > selAllMapValueMapUser() {
        return userMapper.selAllMapValueMapUser();
    }


    public Attributes SelAttribute(int attributeid){
        return userMapper.SelAttribute(attributeid);
    }
}
