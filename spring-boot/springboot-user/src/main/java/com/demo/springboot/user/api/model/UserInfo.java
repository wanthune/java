package com.demo.springboot.user.api.model;
import lombok.Data;

import java.io.Serializable;

/**
 * 实体类(user_info)
 *
 * @author HuangBo13
 * @date 2020/11/16
 */
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 918624475889684674L;

    private Integer id;
    private String name;

    private Integer age;

}