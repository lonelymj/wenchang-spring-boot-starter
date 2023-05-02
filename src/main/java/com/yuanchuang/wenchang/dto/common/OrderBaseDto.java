package com.yuanchuang.wenchang.dto.common;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrderBaseDto extends BaseDto{
    private String order_id;
}
