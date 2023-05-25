package com.reggie.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class OrdersCancelDTO implements Serializable {

    private Long id;
    //订单取消原因
    private String cancelReason;

}
