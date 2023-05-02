package com.yuanchuang.wenchang.dto.account;

import com.yuanchuang.wenchang.dto.common.OperationBaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CreateAccountDto extends OperationBaseDto {
    /**
     * 链账户名称，支持 1-20 位汉字、大小写字母及数字组成的字符串
     */
    private String name;
}
