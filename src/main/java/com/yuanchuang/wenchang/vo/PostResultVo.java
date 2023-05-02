package com.yuanchuang.wenchang.vo;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PostResultVo extends ResultBaseVo{
    String operationId;
    JSONObject result;
    Boolean success;

    public void setData(JSONObject result){
        if(result.containsKey("error")){
            setErrorData(result.getJSONObject("error"));
            setSuccess(false);
        }else{
            setOperationId(result.getJSONObject("data").getString("operation_id"));
            setResult(result.getJSONObject("data"));
            setSuccess(true);
        }
    }
}
