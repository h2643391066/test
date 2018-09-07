package com.bootdo.activiti.dao;

import com.bootdo.activiti.domain.SalaryDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 审批流程测试表
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-11-25 13:28:58
 */
@Mapper
public interface SalaryDao {
    //按名称获取薪资
	SalaryDO get(String id);
	//根据对象来获取list<SqlaryDO>
	List<SalaryDO> list(Map<String, Object> map);
	//获取记录数
	int count(Map<String, Object> map);
	//保存salary
	int save(SalaryDO salary);
	//更新salary
	int update(SalaryDO salary);
	//按id移除
	int remove(String id);
	//批量移除
	int batchRemove(String[] ids);
}
