package com.reggie.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class PasswordEditDTO implements Serializable {

    //员工id
    private Long empId;

    //旧密码
    private String oldPassword;

    //新密码
    private String newPassword;

}
