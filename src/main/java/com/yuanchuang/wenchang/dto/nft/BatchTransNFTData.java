package com.yuanchuang.wenchang.dto.nft;

import lombok.Data;

import java.util.List;

@Data
public class BatchTransNFTData {
    String recipient;
    List<BatchTransNFT> nfts;
}
