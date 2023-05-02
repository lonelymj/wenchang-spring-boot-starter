package com.yuanchuang.wenchang.service;

import com.yuanchuang.wenchang.dto.nft.*;
import com.yuanchuang.wenchang.vo.GetResultVo;
import com.yuanchuang.wenchang.vo.PostResultVo;
import com.yuanchuang.wenchang.vo.DeleteResultVo;
import com.yuanchuang.wenchang.vo.PatchResultVo;

public interface NftService {
    /**
     * POST 创建 NFT 类别
     * @param dto
     * @return
     */
    PostResultVo createClass(CreateClassDto dto);

    /**
     * GET 查询 NFT 类别
     * @param dto
     * @return
     */
    GetResultVo getClass(GetClassDto dto);

    /**
     * GET 查询 NFT 类别详情
     * @param id  NFT 类别 ID  (PATH PARAMETERS)
     * @return
     */
    GetResultVo getClassDetail(String id);

    /**
     * POST 转让 NFT 类别
     * @param class_id NFT 类别 ID  (PATH PARAMETERS)
     * @param owner NFT 类别权属者地址  (PATH PARAMETERS)
     * @param dto
     * @return
     */
    PostResultVo transClass(String class_id,String owner,TransClassDto dto);

    /**
     * POST 发行 NFT
     * @param class_id NFT 类别 ID  (PATH PARAMETERS)
     * @param dto
     * @return
     */
    PostResultVo issueNFT(String class_id, IssueNFTDto dto);

    /**
     * POST 转让 NFT
     * @param class_id  NFT 类别 ID  (PATH PARAMETERS)
     * @param owner  NFT 类别 ID  (PATH PARAMETERS)
     * @param nft_id  NFT 类别 ID  (PATH PARAMETERS)
     * @param dto
     * @return
     */
    PostResultVo transNFT(String class_id, String owner, String nft_id, TransNFTDto dto);

    /**
     * PATCh 编辑 NFT
     * @param class_id  NFT 类别 ID  (PATH PARAMETERS)
     * @param owner  NFT 类别 ID  (PATH PARAMETERS)
     * @param nft_id  NFT 类别 ID  (PATH PARAMETERS)
     * @param dto
     * @return
     */
    PatchResultVo editNFT(String class_id, String owner, String nft_id, EditNFTDto dto);

    /**
     * DELETE 销毁 NFT
     * @param class_id  NFT 类别 ID  (PATH PARAMETERS)
     * @param owner  NFT 类别 ID  (PATH PARAMETERS)
     * @param nft_id  NFT 类别 ID  (PATH PARAMETERS)
     * @param dto
     * @return
     */
    DeleteResultVo destroyNFT(String class_id, String owner, String nft_id, DestroyNFTDto dto);

    /**
     * POST 批量发行 NFT
     * @param class_id  NFT 类别 ID  (PATH PARAMETERS)
     * @param dto
     * @return
     */
    PostResultVo batchIssueNFT(String class_id, BatchIssueNFTDto dto);

    /**
     * POST 批量转让 NFT
     * @param owner  NFT 持有者地址  (PATH PARAMETERS)
     * @param dto
     * @return
     */
    PostResultVo batchTransNFT(String owner, BatchTransNFTDto dto);

    /**
     * PATCH 批量编辑 NFT
     * @param owner  NFT 持有者地址  (PATH PARAMETERS)
     * @param dto
     * @return
     */
    PatchResultVo batchEditNFT(String owner, BatchEditNFTDto dto);

    /**
     * DELETE 批量销毁 NFT
     * @param owner  NFT 持有者地址  (PATH PARAMETERS)
     * @param dto
     * @return
     */
    DeleteResultVo batchDestoryNFT(String owner, BatchTransNFTDto dto);

    /**
     * 查询 NFT
     * @param dto
     * @return
     */
    GetResultVo getNFT(GetNFTDto dto);

    /**
     * 查询 NFT 详情
     * @param class_id  NFT 类别 ID  (PATH PARAMETERS)
     * @param nft_id  NFT 类别 ID  (PATH PARAMETERS)
     * @return
     */
    GetResultVo getNFTDetail(String class_id, String nft_id);

    GetResultVo getNFTOptionRecords(String class_id, String nft_id, GetNFTOptionRecordDto dto);
}
