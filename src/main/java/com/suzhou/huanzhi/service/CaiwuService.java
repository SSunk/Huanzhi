package com.suzhou.huanzhi.service;

import com.suzhou.huanzhi.entity.All_Info;
import com.suzhou.huanzhi.entity.Caiwu;

import java.util.List;

/**
 * (Caiwu)表服务接口
 *
 * @author makejava
 * @since 2020-09-23 19:49:54
 */
public interface CaiwuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Caiwu queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Caiwu> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param caiwu 实例对象
     * @return 实例对象
     */
    Caiwu insert(Caiwu caiwu);

    /**
     * 修改数据
     *
     * @param caiwu 实例对象
     * @return 实例对象
     */
    Caiwu update(Caiwu caiwu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<All_Info> queryAll();
}