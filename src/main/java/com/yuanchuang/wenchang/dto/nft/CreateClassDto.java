package com.yuanchuang.wenchang.dto.nft;

import com.yuanchuang.wenchang.dto.common.OperationBaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
@EqualsAndHashCode(callSuper = true)
@Data
public class CreateClassDto extends OperationBaseDto {
    /**
     * NFT 类别名称
     */
    private String name;
    /**
     * NFT 类别 ID，仅支持小写字母及数字，以字母开头
     */
    private String class_id;
    /**
     * 标识
     */
    private String symbol;
    /**
     * 描述
     */
    private String description;
    /**
     * 链外数据链接
     */
    private String uri;
    /**
     * 链外数据 Hash
     */
    private String uri_hash;
    /**
     * 自定义链上元数据
     */
    private String data;
    /**
     * NFT 类别权属者地址，支持任一 Avata 平台内合法链账户地址
     */
    private String owner;
    /**
     * 交易标签, 自定义 key：支持大小写英文字母和汉字和数字，长度6-12位，自定义 value：长度限制在64位字符，支持大小写字母和数字
     */
    private HashMap<String,String> tag;
}
