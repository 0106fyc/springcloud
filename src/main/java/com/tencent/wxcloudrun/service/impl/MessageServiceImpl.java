package com.tencent.wxcloudrun.service.impl;/*
 * @Author:fyc
 * @Data 2022-9-25,11:21
 */

import com.tencent.wxcloudrun.dao.MessageMapper;
import com.tencent.wxcloudrun.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;
}
