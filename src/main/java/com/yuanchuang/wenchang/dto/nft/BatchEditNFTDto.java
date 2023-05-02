package com.yuanchuang.wenchang.dto.nft;

import com.yuanchuang.wenchang.dto.common.OperationBaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class BatchEditNFTDto extends OperationBaseDto {
    List<BatchEditNFT> nfts;

    /**
     * 交易标签, 自定义 key：支持大小写英文字母和汉字和数字，长度6-12位，自定义 value：长度限制在64位字符，支持大小写字母和数字
     */
    private HashMap<String,String> tag;
}
