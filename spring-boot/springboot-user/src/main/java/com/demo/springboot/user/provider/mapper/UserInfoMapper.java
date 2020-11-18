package com.demo.springboot.user.provider.mapper;

import com.demo.springboot.user.api.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 数据访问接口
 *
 * @author HuangBo13
 * @date 2020/11/16
 */
@Mapper
@Repository
public interface UserInfoMapper<UserInfo, Integer> {

}