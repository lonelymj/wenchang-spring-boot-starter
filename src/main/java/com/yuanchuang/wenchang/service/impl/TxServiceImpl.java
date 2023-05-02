package com.yuanchuang.wenchang.service.impl;

import com.yuanchuang.wenchang.service.BaseService;
import com.yuanchuang.wenchang.service.TxService;
import com.yuanchuang.wenchang.vo.GetResultVo;
import org.springframework.stereotype.Service;

@Service
public class TxServiceImpl extends BaseService implements TxService {

    @Override
    public GetResultVo queryResult(String operation_id) {
        // https://stage.apis.avata.bianjie.ai/v1beta1/tx/{operation_id}
        String path = "/v1beta1/tx/"+operation_id;
        return getRequestVo(null,path);
    }
}
