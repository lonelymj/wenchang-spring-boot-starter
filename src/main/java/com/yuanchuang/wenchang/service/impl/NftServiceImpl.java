package com.yuanchuang.wenchang.service.impl;

import com.yuanchuang.wenchang.dto.nft.*;
import com.yuanchuang.wenchang.service.BaseService;
import com.yuanchuang.wenchang.vo.GetResultVo;
import com.yuanchuang.wenchang.vo.PostResultVo;
import com.yuanchuang.wenchang.service.NftService;
import com.yuanchuang.wenchang.vo.DeleteResultVo;
import com.yuanchuang.wenchang.vo.PatchResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NftServiceImpl extends BaseService implements NftService {
    @Override
    public PostResultVo createClass(CreateClassDto dto) {
        log.info("============发行NFT类型============");
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/classes
        String path = "/v1beta1/nft/classes";
        return postRequestVo(dto,path);
    }

    @Override
    public GetResultVo getClass(GetClassDto dto) {
        log.info("============获取NFT类型============");
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/classes
        String path = "/v1beta1/nft/classes";
        return getRequestVo(dto,path);
    }

    @Override
    public GetResultVo getClassDetail(String id) {
        log.info("============获取NFT类型详情============");
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/classes/{id}
        String path = "/v1beta1/nft/classes/"+id;
        return getRequestVo(null,path);
    }

    @Override
    public PostResultVo transClass(String class_id, String owner, TransClassDto dto) {
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/class-transfers/{class_id}/{owner}
        String path = "/v1beta1/nft/class-transfers/"+class_id+"/"+owner;
        return postRequestVo(dto,path);
    }

    @Override
    public PostResultVo issueNFT(String class_id, IssueNFTDto dto) {
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/nfts/{class_id}
        String path = "/v1beta1/nft/nfts/"+class_id;
        return postRequestVo(dto,path);
    }

    @Override
    public PostResultVo transNFT(String class_id, String owner, String nft_id, TransNFTDto dto) {
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/nft-transfers/{class_id}/{owner}/{nft_id}
        String path = "/v1beta1/nft/nft-transfers/"+class_id+"/"+owner+"/"+nft_id;
        return postRequestVo(dto,path);
    }

    @Override
    public PatchResultVo editNFT(String class_id, String owner, String nft_id, EditNFTDto dto) {
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/nfts/{class_id}/{owner}/{nft_id}
        String path = "/v1beta1/nft/nfts/"+class_id+"/"+owner+"/"+nft_id;
        return patchRequestVo(null,dto,path);
    }

    @Override
    public DeleteResultVo destroyNFT(String class_id, String owner, String nft_id, DestroyNFTDto dto) {
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/nfts/{class_id}/{owner}/{nft_id}
        String path = "/v1beta1/nft/nfts/"+class_id+"/"+owner+"/"+nft_id;
        return deleteRequestVo(null,dto,path);
    }

    @Override
    public PostResultVo batchIssueNFT(String class_id, BatchIssueNFTDto dto) {
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/batch/nfts/{class_id}
        log.info("============批量发行NFT============");
        String path = "/v1beta1/nft/batch/nfts/"+class_id;
        return postRequestVo(dto,path);
    }

    @Override
    public PostResultVo batchTransNFT(String owner, BatchTransNFTDto dto) {
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/batch/nft-transfers/{owner}
        String path = "/v1beta1/nft/batch/nft-transfers/"+owner;
        return postRequestVo(dto,path);
    }

    @Override
    public PatchResultVo batchEditNFT(String owner, BatchEditNFTDto dto) {
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/batch/nfts/{owner}
        String path = "/v1beta1/nft/batch/nfts/"+owner;
        return patchRequestVo(null,dto,path);
    }

    @Override
    public DeleteResultVo batchDestoryNFT(String owner, BatchTransNFTDto dto) {
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/batch/nfts/{owner}
        String path = "/v1beta1/nft/batch/nfts/"+owner;
        return deleteRequestVo(null,dto,path);
    }

    @Override
    public GetResultVo getNFT(GetNFTDto dto) {
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/nfts
        String path = "/v1beta1/nft/nfts";
        return getRequestVo(dto,path);
    }

    @Override
    public GetResultVo getNFTDetail(String class_id, String nft_id) {
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/nfts/{class_id}/{nft_id}
        String path = "/v1beta1/nft/nfts/"+class_id+"/"+nft_id;
        return getRequestVo(null,path);
    }

    @Override
    public GetResultVo getNFTOptionRecords(String class_id, String nft_id, GetNFTOptionRecordDto dto) {
        // https://stage.apis.avata.bianjie.ai/v1beta1/nft/nfts/{class_id}/{nft_id}/history
        String path = "/v1beta1/nft/nfts/"+class_id+"/"+nft_id+"/history";
        return getRequestVo(dto,path);
    }
}
