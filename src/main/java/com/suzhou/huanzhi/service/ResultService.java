package com.suzhou.huanzhi.service;

import com.suzhou.huanzhi.entity.All_Info;
import com.suzhou.huanzhi.entity.Result;

import java.util.List;

/**
 * (Result)表服务接口
 *
 * @author makejava
 * @since 2020-09-23 19:50:08
 */
public interface ResultService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Result queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Result> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param result 实例对象
     * @return 实例对象
     */
    Result insert(Result result);

    /**
     * 修改数据
     *
     * @param result 实例对象
     * @return 实例对象
     */
    Result update(Result result);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<All_Info> queryAll();
}