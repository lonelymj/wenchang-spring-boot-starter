package com.yuanchuang.wenchang.vo;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatchResultVo extends ResultBaseVo{
    String operationId;

    public void setData(JSONObject result){
        if(result.containsKey("error")){
            setErrorData(result.getJSONObject("error"));
        }else{
            setOperationId(result.getJSONObject("data").getString("operation_id"));
        }
    }
}
