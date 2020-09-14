package com.gis.entity;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by Administrator on 2020/9/14.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer userid;
    private String username;
    private String phone;
    private String sex;

    /**
     * 用户属性
     */
    private List<Attributes> attributes;

    @Override
    public String toString(){
        String resultString = "";
        resultString = JSON.toJSONString(this);
        return resultString;
    }

}
