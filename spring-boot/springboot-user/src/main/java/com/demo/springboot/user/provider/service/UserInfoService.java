package com.demo.springboot.user.provider.service;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * 业务类
 *
 * @author HuangBo13
 * @date 2020/11/16
 */
@Service("userInfoService")
public class UserInfoService implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String test1(){
        return applicationContext.getEnvironment().getProperty("key1");
    }
}