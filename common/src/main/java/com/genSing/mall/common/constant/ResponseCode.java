package com.genSing.mall.common.constant;

import java.util.*;

public enum  ResponseCode {
    /**
     * 系统返回码
     * */
    SUCCESS(200,"成功！"),
    FAILED(500,"服务器错误！");

    private int code;
    private String msg;

    private static Map<Integer,String> map = new HashMap<>();

    private static List<ResponseCode> list = new ArrayList<>();

    static {
        for (ResponseCode status : ResponseCode.values()){
            map.put(status.getCode(),status.getMsg());
        }
        list.addAll(Arrays.asList(ResponseCode.values()));
    }

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static Map<Integer, String> getMap() {
        return map;
    }

    public static void setMap(Map<Integer, String> map) {
        ResponseCode.map = map;
    }

    public static List<ResponseCode> getList() {
        return list;
    }

    public static void setList(List<ResponseCode> list) {
        ResponseCode.list = list;
    }
}
