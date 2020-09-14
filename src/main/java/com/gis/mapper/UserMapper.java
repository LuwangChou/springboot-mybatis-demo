package com.gis.mapper;

import com.gis.entity.Attributes;
import com.gis.entity.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2020/9/14.
 */
@Repository
public interface UserMapper {

    User Sel(@Param(value="userid") int userid, @Param(value="attributeid") int attributeid);

    List<User> SelAllUser();

    @MapKey("userid")
    Map<Long,User> SelAllMapUser();

    @MapKey("userid")
    Map<Long,Map<String,User > > selAllMapValueMapUser();


    Attributes SelAttribute(int attributeid);

}
