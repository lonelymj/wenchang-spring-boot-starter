package com.yuanchuang.wenchang.dto.nft;

import lombok.Data;

@Data
public class BatchEditNFT {
    String class_id;
    String nft_id;
    String name;
    String uri;
    String data;
}
