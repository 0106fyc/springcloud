package com.tencent.wxcloudrun.model;/*
 * @Author:fyc
 * @Data 2022-9-25,11:19
 */

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName("message")
public class Message {
    Integer id;
    @ApiModelProperty("详细信息")
    String name;
}
