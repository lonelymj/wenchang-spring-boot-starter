package com.yuanchuang.wenchang.dto.nft;

import com.yuanchuang.wenchang.dto.common.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetNFTOptionRecordDto extends BaseDto {
    /**
     * 游标，默认为 0
     */
    String offset;
    /**
     * 每页记录数，默认为 10，上限为 50
     */
    String limit;
    /**
     * Tx 签名者地址
     */
    String signer;
    /**
     * 创建 NFT 的 Tx Hash
     */
    String tx_hash;
    /**
     * 操作类型：mint / edit / transfer / burn
     */
    String operation;
    /**
     * NFT 创建日期范围 - 开始，yyyy-MM-dd（UTC 时间）
     */
    String start_date;
    /**
     * NFT 创建日期范围 - 结束，yyyy-MM-dd（UTC 时间）
     */
    String end_date;
    /**
     * 排序规则：DATE_ASC / DATE_DESC
     */
    String sort_by;
}
