package com.suzhou.huanzhi.service;

import com.suzhou.huanzhi.entity.All_Info;
import com.suzhou.huanzhi.entity.BaseContract;

import java.util.List;

/**
 * (BaseContract)表服务接口
 *
 * @author makejava
 * @since 2020-09-23 19:49:33
 */
public interface BaseContractService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BaseContract queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BaseContract> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param baseContract 实例对象
     * @return 实例对象
     */
    BaseContract insert(BaseContract baseContract);

    /**
     * 修改数据
     *
     * @param baseContract 实例对象
     * @return 实例对象
     */
    BaseContract update(BaseContract baseContract);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<All_Info> queryAll();

    BaseContract getLastContract();
}