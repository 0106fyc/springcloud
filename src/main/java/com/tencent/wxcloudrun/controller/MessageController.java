package com.tencent.wxcloudrun.controller;/*
 * @Author:fyc
 * @Data 2022-9-25,11:24
 */

import com.tencent.wxcloudrun.dao.MessageMapper;
import com.tencent.wxcloudrun.model.Message;
import com.tencent.wxcloudrun.util.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "测试接口")
public class MessageController {

    @Autowired
    MessageMapper messageMapper;

    @GetMapping("/getMessage")
    @ApiOperation("获取信息列表")
    public ResultInfo getMessage(){

        List<Message> messages = messageMapper.selectList(null);
        return ResultInfo.success(200,"ok",messages);
    }
    @PostMapping("/addMessage")
    @ApiOperation("上传信息")
    public ResultInfo addMessage(@RequestBody Message message){
        try {
            int insert = messageMapper.insert(message);
            if (insert>0){
                return ResultInfo.success(200,"添加成功");
            }
            return ResultInfo.err();
        }catch (Exception e){
            return ResultInfo.err(e.getMessage());
        }
    }
}
