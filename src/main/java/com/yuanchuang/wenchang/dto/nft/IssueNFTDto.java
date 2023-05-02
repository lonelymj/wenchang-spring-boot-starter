package com.yuanchuang.wenchang.dto.nft;

import com.yuanchuang.wenchang.dto.common.OperationBaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
@EqualsAndHashCode(callSuper = true)
@Data
public class IssueNFTDto extends OperationBaseDto {
    /**
     * NFT 名称
     */
    String name;
    /**
     * 链外数据链接
     */
    String uri;
    /**
     * 链外数据 Hash
     */
    String uri_hash;
    /**
     * 自定义链上元数据
     */
    String data;
    /**
     * NFT 接收者地址，支持任一文昌链合法链账户地址，默认为 NFT 类别的权属者地址
     */
    String recipient;
    /**
     * 交易标签, 自定义 key：支持大小写英文字母和汉字和数字，长度6-12位，自定义 value：长度限制在64位字符，支持大小写字母和数字
     */
    private HashMap<String,String> tag;
}
