package com.yuanchuang.wenchang.service;

import com.yuanchuang.wenchang.dto.account.AccountOptionRecordDto;
import com.yuanchuang.wenchang.dto.account.QueryAccountsDto;
import com.yuanchuang.wenchang.vo.PostResultVo;
import com.yuanchuang.wenchang.dto.account.BatchCreateAccountDto;
import com.yuanchuang.wenchang.dto.account.CreateAccountDto;
import com.yuanchuang.wenchang.vo.GetResultVo;

public interface AccountService {
    /**
     * 创建链账户
     * @param dto
     * @return
     */
    PostResultVo createAccount(CreateAccountDto dto);

    /**
     * 批量创建链账户
     * @param dto
     * @return
     */
    PostResultVo batchCreateAccount(BatchCreateAccountDto dto);

    /**
     * 查询链账户
     * @param dto
     * @return
     */
    GetResultVo queryAccount(QueryAccountsDto dto);

    /**
     * 查询链账户操作记录
     * @param dto
     * @return
     */
    GetResultVo accountOptionRecord(AccountOptionRecordDto dto);
}
