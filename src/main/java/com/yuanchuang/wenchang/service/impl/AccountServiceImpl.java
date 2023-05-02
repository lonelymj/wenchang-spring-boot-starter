package com.yuanchuang.wenchang.service.impl;

import com.yuanchuang.wenchang.dto.account.AccountOptionRecordDto;
import com.yuanchuang.wenchang.dto.account.CreateAccountDto;
import com.yuanchuang.wenchang.dto.account.QueryAccountsDto;
import com.yuanchuang.wenchang.service.AccountService;
import com.yuanchuang.wenchang.service.BaseService;
import com.yuanchuang.wenchang.vo.GetResultVo;
import com.yuanchuang.wenchang.vo.PostResultVo;
import com.yuanchuang.wenchang.dto.account.BatchCreateAccountDto;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl extends BaseService implements AccountService {

    @Override
    public PostResultVo createAccount(CreateAccountDto dto) {
        String path = "/v1beta1/account";
        return postRequestVo(dto, path);
    }

    @Override
    public PostResultVo batchCreateAccount(BatchCreateAccountDto dto) {
        // https://stage.apis.avata.bianjie.ai/v1beta1/accounts
        String path = "/v1beta1/accounts";
        return postRequestVo(dto, path);
    }

    @Override
    public GetResultVo queryAccount(QueryAccountsDto dto) {
        String path = "/v1beta1/accounts";
        return getRequestVo(dto, path);
    }

    @Override
    public GetResultVo accountOptionRecord(AccountOptionRecordDto dto) {
        String path = "/v1beta1/accounts/history";
        return getRequestVo(dto, path);
    }
}
