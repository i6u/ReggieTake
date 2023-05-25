package com.reggie.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class OrdersRejectionDTO implements Serializable {

    private Long id;

    //订单拒绝原因
    private String rejectionReason;

}
