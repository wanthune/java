package com.demo.springboot.user.provider.controller;

import com.demo.springboot.user.api.model.UserInfo;
import com.demo.springboot.user.provider.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 表现层控制类
 *
 * @author HuangBo13
 * @date 2020/11/16
 */
@RestController
public class UserInfoController  {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserInfoService userInfoService;


    @RequestMapping(value = "/userInfo/get", method = RequestMethod.GET)
    public String get() {
        System.out.println("get");
        return userInfoService.test1();
        //return new ResponseEntity<String>(s, HttpStatus.OK);
    }

    @RequestMapping(value = "/userInfo/save", method = RequestMethod.POST)
    public ResponseEntity<Integer> save(@RequestBody UserInfo userInfo) {
        return null;
    }

    @RequestMapping(value = "/userInfo/update", method = RequestMethod.POST)
    public ResponseEntity<Integer> update(@RequestBody UserInfo userInfo) {
        return null;
    }

    @RequestMapping(value = "/userInfo/list", method = RequestMethod.POST)
    public ResponseEntity<List<UserInfo>> list(@RequestBody UserInfo userInfo) {
        return null;
    }



}