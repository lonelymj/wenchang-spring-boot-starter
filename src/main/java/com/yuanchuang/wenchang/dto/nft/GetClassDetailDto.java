package com.yuanchuang.wenchang.dto.nft;

import com.yuanchuang.wenchang.dto.common.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetClassDetailDto extends BaseDto {
    /**
     * NFT 类别 ID
     */
    String id;
}
