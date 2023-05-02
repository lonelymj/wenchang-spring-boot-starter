package com.yuanchuang.wenchang.vo.nft;

import lombok.Data;

import java.util.List;

@Data
public class GetClassVo {
    /**
     * 游标
     */
    private int offset;
    /**
     * 每页记录数
     */
    private int limit;
    /**
     * 总记录数
     */
    private int totalCount;

    /**
     * 类别列表
     */
    private List<Clazz> classes;
    @Data
    private class Clazz {
        /**
         * NFT 类别 ID
         */
        private String id;
        /**
         * NFT 类别名称
         */
        private String name;
        /**
         * NFT 类别标识
         */
        private String symbol;
        /**
         * NFT 类别包含的 NFT 总量
         */
        private String nftCount;
        /**
         * 链外数据链接
         */
        private String uri;
        /**
         * NFT 类别权属者地址
         */
        private String owner;
        /**
         * 创建 NFT 类别的 Tx Hash
         */
        private String txHash;
        /**
         * 创建 NFT 类别的时间戳（UTC 时间）
         */
        private String timestamp;
    }
}
