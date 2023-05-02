package com.yuanchuang.wenchang.dto.nft;

import lombok.Data;

@Data
public class Recipient {
    /**
     * NFT 发行数量
     */
    Integer amount;
    /**
     * NFT 接收者地址，支持任一文昌链合法链账户地址。
     */
    String recipient;
}
