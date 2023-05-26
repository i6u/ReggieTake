package com.reggie.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class EmployeeDTO implements Serializable {

    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
