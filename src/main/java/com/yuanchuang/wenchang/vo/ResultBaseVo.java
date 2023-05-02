package com.yuanchuang.wenchang.vo;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

@Data
public class ResultBaseVo {
    String code;
    String codeSpace;
    String message;

    protected void setErrorData(JSONObject result) {
        setCode(result.getString("code"));
        setCodeSpace(result.getString("code_space"));
        setMessage(result.getString("message"));
    }
}
