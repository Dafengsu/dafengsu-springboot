package com.dafengsu.springboot.user.mapper;

import com.dafengsu.springboot.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author su
 * @description
 * @date 2020/4/4
 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {

}
