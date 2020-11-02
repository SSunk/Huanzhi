package com.suzhou.huanzhi.service;

import com.suzhou.huanzhi.entity.Manage;

import java.util.List;

/**
 * (Manage)表服务接口
 *
 * @author makejava
 * @since 2020-09-23 23:46:28
 */
public interface ManageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Manage queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Manage> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param manage 实例对象
     * @return 实例对象
     */
    Manage insert(Manage manage);

    /**
     * 修改数据
     *
     * @param manage 实例对象
     * @return 实例对象
     */
    Manage update(Manage manage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<Manage> queryAll();
}