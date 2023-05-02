package com.yuanchuang.wenchang.service;

import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yuanchuang.wenchang.config.WenChangProperties;
import com.yuanchuang.wenchang.dto.common.BaseDto;
import com.yuanchuang.wenchang.util.AvataUtils;
import com.yuanchuang.wenchang.util.BeanMapUtils;
import com.yuanchuang.wenchang.vo.DeleteResultVo;
import com.yuanchuang.wenchang.vo.GetResultVo;
import com.yuanchuang.wenchang.vo.PatchResultVo;
import com.yuanchuang.wenchang.vo.PostResultVo;
import com.yuanchuang.wenchang.vo.nft.GetClassVo;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

@Slf4j
public class BaseService {

    @Resource
    private WenChangProperties wenChangProperties;

    protected <T extends BaseDto> PostResultVo postRequestVo(T dto, String path){
        JSONObject result = JSONObject.parseObject(postRequest(dto,path));
        PostResultVo vo = new PostResultVo();
        vo.setData(result);
        return vo;
    }

    protected <T extends BaseDto> String postRequest(T dto, String path) {
        String url = wenChangProperties.getApiUrl() + path;
        long ts = System.currentTimeMillis();
        String tsStr = Long.toString(ts);
        setOperationId(dto,tsStr);
        setOrderId(dto,tsStr);

        Map<String, Object> bodyMap = BeanMapUtils.beanToMap(dto);
        String bodyJson = JSON.toJSONString(dto);

        ConcurrentMap<String, String> headers = getHeaders(path, ts, null, bodyMap);

        log.info("Post请求--url:{},apiKey:{},apiSecret:{},header参数:{},body参数:{}",url,wenChangProperties.getApiKey(), wenChangProperties.getApiSecret(),JSON.toJSONString(headers),bodyJson);
        log.info("请求体字节长度：{}",bodyJson.getBytes(StandardCharsets.UTF_8).length);
        String result = HttpRequest.post(url)
                .headerMap(headers,true)
                .body(bodyJson)//表单内容
                .timeout(20000)//超时，毫秒
                .execute().body();
        log.info("结果:{}",result);
        return result;
    }
    protected <T extends BaseDto> GetResultVo getRequestVo(T dto, String path){
        JSONObject result = JSONObject.parseObject(getRequest(dto,path));
        GetResultVo vo = new GetResultVo();
        vo.setData(result);
        return vo;
    }

    protected <T extends BaseDto> String getRequest(T dto, String path) {
        String url = wenChangProperties.getApiUrl() + path;

        long ts = System.currentTimeMillis();
        String tsStr = Long.toString(ts);

        setOrderId(dto,tsStr);

        Map<String, Object> requestMap = BeanMapUtils.beanToMap(dto);
        String bodyJson = JSON.toJSONString(dto);
        ConcurrentMap<String, String> headers = getHeaders(path, ts, requestMap,null);
        url = url + AvataUtils.toParams(requestMap);

        log.info("Get请求--url:{},apiKey:{},apiSecret:{},header参数:{},query参数:{}",url,wenChangProperties.getApiKey(), wenChangProperties.getApiSecret(),JSON.toJSONString(headers),bodyJson);

        String result = HttpRequest.get(url)
                .headerMap(headers,true)
                .form(bodyJson)//表单内容
                .timeout(20000)//超时，毫秒
                .execute().body();
        log.info("结果:{}",result);
        return result;
    }

    protected <T extends BaseDto> PatchResultVo patchRequestVo(T queryDto,T bodyDto, String path){
        JSONObject result = JSONObject.parseObject(patchRequest(queryDto,bodyDto,path));
        PatchResultVo vo = new PatchResultVo();
        vo.setData(result);
        return vo;
    }

    protected <T extends BaseDto> String patchRequest(T queryDto,T bodyDto, String path) {
        String url = "%s%s".formatted(wenChangProperties.getApiUrl(), path);

        long ts = System.currentTimeMillis();
        String tsStr = Long.toString(ts);

        setOperationId(bodyDto,tsStr);
        setOrderId(queryDto,tsStr);
        setOrderId(bodyDto,tsStr);

        Map<String, Object> queryMap = BeanMapUtils.beanToMap(queryDto);
        String queryJson = JSON.toJSONString(queryDto);
        url = url + AvataUtils.toParams(queryMap);

        Map<String, Object> bodyMap = BeanMapUtils.beanToMap(bodyDto);
        String bodyJson = JSON.toJSONString(queryDto);

        ConcurrentMap<String, String> headers = getHeaders(path, ts, queryMap, bodyMap);

        log.info("Patch请求--url:{},apiKey:{},apiSecret:{},header参数:{},query参数:{},body参数:{}",url,wenChangProperties.getApiKey(), wenChangProperties.getApiSecret(),JSON.toJSONString(headers),queryJson,bodyJson);

        String result = HttpRequest.patch(url)
                .headerMap(headers,true)
                .form(queryMap)
                .body(bodyJson)//表单内容
                .timeout(20000)//超时，毫秒
                .execute().body();
        log.info("结果:{}",result);
        return result;
    }

    protected <T extends BaseDto> DeleteResultVo deleteRequestVo(T queryDto, T bodyDto, String path){
        JSONObject result = JSONObject.parseObject(deleteRequest(queryDto,bodyDto,path));
        DeleteResultVo vo = new DeleteResultVo();
        vo.setData(result);
        return vo;
    }

    protected <T extends BaseDto> String deleteRequest(T queryDto,T bodyDto, String path) {
        String url = wenChangProperties.getApiUrl()+ path;

        long ts = System.currentTimeMillis();
        String tsStr = Long.toString(ts);
        setOperationId(bodyDto,tsStr);

        setOrderId(queryDto,tsStr);
        setOrderId(bodyDto,tsStr);

        Map<String, Object> queryMap = BeanMapUtils.beanToMap(queryDto);
        String queryJson = JSON.toJSONString(queryDto);
        url = url + AvataUtils.toParams(queryMap);

        Map<String, Object> bodyMap = BeanMapUtils.beanToMap(bodyDto);
        String bodyJson = JSON.toJSONString(bodyDto);

        ConcurrentMap<String, String> headers = getHeaders(path, ts, queryMap, bodyMap);
        log.info("Delete请求--url:{},apiKey:{},apiSecret:{},header参数:{},query参数:{},body参数:{}",url,wenChangProperties.getApiKey(), wenChangProperties.getApiSecret(),JSON.toJSONString(headers),queryJson,bodyJson);

        String result = HttpRequest.delete(url)
                .headerMap(headers,true)
                .form(bodyMap)
                .body(bodyJson)//表单内容
                .timeout(20000)//超时，毫秒
                .execute().body();
        log.info("结果:{}",result);
        return result;
    }

//    private void setOwner(T dto){
//        if(null==dto){
//            return;
//        }
//        Field ownerField = ReflectionUtils.findField(dto.getClass(), "owner", String.class);
//
//        if(ownerField!=null){
//            ownerField.setAccessible(true);
//            ReflectionUtils.setField(ownerField,dto,owner);
//        }
//    }

    private <T extends BaseDto> void setOperationId(T dto,String operationId){
        if(null==dto){
            return;
        }
        Field ownerField = ReflectionUtils.findField(dto.getClass(), "operation_id", String.class);
        if(ownerField!=null){
            ownerField.setAccessible(true);
            ReflectionUtils.setField(ownerField,dto,operationId);
        }
    }

    private <T extends BaseDto> void setOrderId(T dto,String orderId){
        if(null==dto){
            return;
        }
        Field ownerField = ReflectionUtils.findField(dto.getClass(), "order_id", String.class);
        if(ownerField!=null){
            ownerField.setAccessible(true);
            ReflectionUtils.setField(ownerField,dto,"Order_"+orderId);
        }
    }

    private ConcurrentMap<String, String> getHeaders(String path, long ts, Map<String, Object> queryMap, Map<String, Object> bodyMap) {
        return AvataUtils.getHeaderMap(path, queryMap, bodyMap, ts, wenChangProperties.getApiKey(), wenChangProperties.getApiSecret());
    }

}
