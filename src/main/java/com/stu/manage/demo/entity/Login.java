package com.stu.manage.demo.entity;


import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 登录
 *
 * @author shr
 */


@Data
public class Login {
    @NotNull
    private String adminName;
    @NotNull
    private String passWord;
    @NotNull
    private boolean character;
}
