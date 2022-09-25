package com.tencent.wxcloudrun.dao;/*
 * @Author:fyc
 * @Data 2022-9-25,11:20
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tencent.wxcloudrun.model.Message;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper extends BaseMapper<Message> {
}
