package com.bootdo.activiti.service;

import com.bootdo.activiti.domain.ActivitiDO;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 *任务进程服务
 */
public interface ActTaskService {
	//查看所有任务进程
    List<ActivitiDO> listTodo(ActivitiDO act);
    //查看具体进程内容
    void complete(String taskId, String procInsId, String comment, String title, Map<String, Object> vars);
    //查看进程
    void complete(String taskId,Map<String,Object> vars);
    //开始处理
    String startProcess(String procDefKey, String businessTable, String businessId, String title, Map<String, Object> vars);
    //获取得到关键形式
    String getFormKey(String procDefId, String taskDefKey);
    //拍照，processDefinitionId流程定义id
    InputStream tracePhoto(String processDefinitionId, String executionId);
}
