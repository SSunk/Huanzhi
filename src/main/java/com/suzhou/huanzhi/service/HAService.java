package com.suzhou.huanzhi.service;

import com.suzhou.huanzhi.entity.HA;

import java.util.List;

/**
 * (HA)表服务接口
 *
 * @author makejava
 * @since 2020-11-01 14:13:42
 */
public interface HAService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    HA queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<HA> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param hA 实例对象
     * @return 实例对象
     */
    HA insert(HA hA);

    /**
     * 修改数据
     *
     * @param hA 实例对象
     * @return 实例对象
     */
    HA update(HA hA);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<HA> queryAll();
}