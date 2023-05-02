package com.yuanchuang.wenchang.dto.account;

import com.yuanchuang.wenchang.dto.common.OperationBaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BatchCreateAccountDto extends OperationBaseDto {
    /**
     * 批量创建链账户的数量 [ 1 .. 1000 ]
     */
    Integer count;
}
