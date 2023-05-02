package com.yuanchuang.wenchang.vo;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetResultVo extends ResultBaseVo{
    JSONObject result;
    Boolean success;

    public void setData(JSONObject result){
        if(result.containsKey("error")){
            setErrorData(result.getJSONObject("error"));
            setSuccess(false);
        }else{
            setResult(result.getJSONObject("data"));
            setSuccess(true);
        }
    }
}
