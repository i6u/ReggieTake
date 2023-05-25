package com.reggie.dto;

import java.io.Serializable;
import lombok.Data;

/**
 * C端用户登录
 */
@Data
public class UserLoginDTO implements Serializable {

    private String code;

}
