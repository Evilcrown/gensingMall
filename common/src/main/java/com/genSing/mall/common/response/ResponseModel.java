package com.genSing.mall.common.response;

import com.genSing.mall.common.constant.ResponseCode;

import java.io.Serializable;

public class ResponseModel implements Serializable {

    private static final long serialVersionUID = -3491933374422563937L;

    private int code;
    private String message;
    private Object result;

    public ResponseModel() {
    }

    public ResponseModel(ResponseCode respCode, Object data) {
        this.code = respCode.getCode();
        this.message = respCode.getMsg();
        this.result = data;
    }

    public ResponseModel(ResponseCode respCode) {
        this.code = respCode.getCode();
        this.message = respCode.getMsg();
    }

    public ResponseModel(int code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResponseModel{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
