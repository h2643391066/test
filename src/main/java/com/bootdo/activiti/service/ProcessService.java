package com.bootdo.activiti.service;

import org.activiti.engine.repository.Model;
import org.springframework.stereotype.Service;

import java.io.InputStream;

/**
 流程服务
 */
@Service
public interface ProcessService {
    Model convertToModel(String procDefId) throws Exception;
    //资源读取
    InputStream resourceRead(String id, String resType) throws Exception;
}
