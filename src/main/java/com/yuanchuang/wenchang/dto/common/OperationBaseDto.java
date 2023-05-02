package com.yuanchuang.wenchang.dto.common;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class OperationBaseDto extends BaseDto{
    /**
     * 操作 ID，保证幂等性，避免重复请求，保证对于同一操作发起的一次请求或者多次请求的结果是一致的；由接入方生成的、
     * 针对每个 Project ID 唯一的、不超过 64 个大小写字母、数字、-、下划线的字符串
     */
    private String operation_id;
}
