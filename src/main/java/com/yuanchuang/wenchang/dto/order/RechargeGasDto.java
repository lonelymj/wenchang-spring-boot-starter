package com.yuanchuang.wenchang.dto.order;

import com.yuanchuang.wenchang.dto.common.OrderBaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class RechargeGasDto extends OrderBaseDto {
    private String account;
    private int amount;
    private String order_type="gas";
}
