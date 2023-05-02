package com.yuanchuang.wenchang.dto.account;

import com.yuanchuang.wenchang.dto.common.OperationBaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class QueryAccountsDto extends OperationBaseDto {
    /**
     * 游标，默认为 0
     */
    private String offset;
    /**
     * 每页记录数，默认为 10，上限为 50
     */
    private String limit;
    /**
     * 链账户地址
     */
    private String account;
    /**
     * 链账户名称，支持模糊查询
     */
    private String name;
    /**
     * 创建日期范围 - 开始，yyyy-MM-dd（UTC 时间）
     */
    private String start_date;
    /**
     * 创建日期范围 - 结束，yyyy-MM-dd（UTC 时间）
     */
    private String end_date;
    /**
     * 排序规则：DATE_ASC / DATE_DESC
     */
    private String sort_by;
}
