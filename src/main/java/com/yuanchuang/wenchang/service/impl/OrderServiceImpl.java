package com.yuanchuang.wenchang.service.impl;

import com.yuanchuang.wenchang.service.BaseService;
import com.yuanchuang.wenchang.dto.order.RechargeGasDto;
import com.yuanchuang.wenchang.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends BaseService implements OrderService {
    @Override
    public void rechargeGas(RechargeGasDto dto) {
        String path = "/v1beta1/orders";
        postRequest(dto,path);
    }
}
