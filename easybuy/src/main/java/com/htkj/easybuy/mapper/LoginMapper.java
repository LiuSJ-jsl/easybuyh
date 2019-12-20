package com.htkj.easybuy.mapper;

import com.htkj.easybuy.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Description:
 * @Author: LiuShanJie
 * @date: 2019/11/13 8:36
 */
public interface LoginMapper {
    /**
     * @return com.htkj.easybuy_entity.entity.LoginUser
     * @MethodName: User
     * @Description: 登录
     * @author LiuShanJie
     * @Param [mobile, password]
     * @date 2019/10/19 8:40
     */
    @Select("select * from easybuy.easybuy_user where userName = #{userName} and password = #{password}")
    User login(@Param("userName") String userName, @Param("password") String password);

}
