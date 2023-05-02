package com.yuanchuang.wenchang.dto.nft;

import com.yuanchuang.wenchang.dto.common.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
@EqualsAndHashCode(callSuper = true)
@Data
public class GetClassDto extends BaseDto {
    /**
     * NFT 类别 ID
     */
    String id;
    /**
     * 游标，默认为 0
     */
    String offset;
    /**
     * 每页记录数，默认为 10，上限为 50
     */
    String limit;
    /**
     * NFT 类别名称，支持模糊查询
     */
    String name;
    /**
     * NFT 类别权属者地址
     */
    String owner;
    /**
     * 创建 NFT 类别的 Tx Hash
     */
    String tx_hash;
    /**
     * NFT 类别创建日期范围 - 开始，yyyy-MM-dd（UTC 时间）
     */
    String start_date;
    /**
     * NFT 类别创建日期范围 - 结束，yyyy-MM-dd（UTC 时间）
     */
    String end_date;
    /**
     * 排序规则：DATE_ASC / DATE_DESC
     */
    String sort_by;
}
