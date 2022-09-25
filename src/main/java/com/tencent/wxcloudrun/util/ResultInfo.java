package com.tencent.wxcloudrun.util;/*
 * @Author:fyc
 * @Data 2022-6-24,9:20
 */

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultInfo {

    public static final String OK_MSG="操作成功！";
    public static final String ERR_MSG="操作失败！";

    private int code;//状态码
    private String msg;//信息
    private Object data;//返回数据

    public ResultInfo(){}

    public ResultInfo(String msg) {
        this.msg=msg;
    }

    public ResultInfo(String msg, Object data) {
        this.msg=msg;
        this.data=data;
    }

    //返回成功数据
    public static ResultInfo success(String msg){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(msg);
        return  resultInfo;
    }

    //无数据返回
    public static ResultInfo success(int code,String msg){
        ResultInfo resultInfo=new ResultInfo();
        resultInfo.setCode(code);
        resultInfo.setMsg(msg);
        return  resultInfo;
    }
    //无状态返回
    public static ResultInfo success(String msg,Object data){
        ResultInfo resultInfo=new ResultInfo();
        resultInfo.setData(data);
        resultInfo.setMsg(msg);
        return  resultInfo;
    }

    //数据返回
    public static ResultInfo success(int code,String msg,Object data){
        ResultInfo resultInfo=new ResultInfo();
        resultInfo.setCode(code);
        resultInfo.setMsg(msg);
        resultInfo.setData(data);
        return resultInfo;
    }

    //错误返回
    public static ResultInfo err(){
        return new ResultInfo(0,"请求错误",null);
    }
    public static ResultInfo err(String msg){
        return new ResultInfo(msg);
    }

    //错误信息返回
    public static ResultInfo err(String msg,Object data){
        return new ResultInfo(msg,data);
    }



}
