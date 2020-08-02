package com.genSing.mall.common.response;

import com.genSing.mall.common.constant.ResponseCode;

/**
 * 统一返回数据格式
 * */
public class ResponseHelper {
    public ResponseHelper() {
    }

    public static ResponseModel responseBuilder(Integer code,String message){
        ResponseModel response = new ResponseModel();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    /**
     * 无返回数据
     * */
    public static ResponseModel responseBuilder(ResponseCode respCode){
        return new ResponseModel(respCode);
    }

    /**
     * 有返回数据
     * */
    public static ResponseModel responseBuilder(ResponseCode respCode, Object data){
        return new ResponseModel(respCode,data);
    }
}
