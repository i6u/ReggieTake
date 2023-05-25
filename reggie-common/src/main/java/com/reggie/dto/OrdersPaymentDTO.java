package com.reggie.dto;

import lombok.Data;

@Data
public class OrdersPaymentDTO {
    //订单号
    private String orderNumber;

    //付款方式
    private Integer payMethod;

}
