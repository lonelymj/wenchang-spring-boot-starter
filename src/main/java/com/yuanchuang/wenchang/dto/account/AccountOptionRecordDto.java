package com.yuanchuang.wenchang.dto.account;

import com.yuanchuang.wenchang.dto.common.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountOptionRecordDto extends BaseDto {
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
     * 功能模块：nft / mt
     */
    private String module;
    /**
     * 操作类型，仅 module 不为空时有效，默认为 "all"，
     * module = nft 时可选：transfer_class / mint / edit / transfer / burn / issue_class
     * module = mt 时可选：transfer_class / issue / mint / edit / transfer / burn / issue_class
     */
    private String operation;
    /**
     * Tx Hash
     */
    private String tx_hash;
    /**
     * 日期范围 - 开始，yyyy-MM-dd（UTC 时间）
     */
    private String start_date;
    /**
     * 日期范围 - 结束，yyyy-MM-dd（UTC 时间）
     */
    private String end_date;
    /**
     * 排序规则：DATE_ASC / DATE_DESC
     */
    private String sort_by;
}
