package com.gis.entity;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Administrator on 2020/9/14.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Attributes {
    private Integer attributeid;
    private String attributename;

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }
}
