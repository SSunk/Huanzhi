package com.suzhou.huanzhi.dao;

import com.suzhou.huanzhi.entity.All_Info;
import com.suzhou.huanzhi.entity.Support;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Support)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-23 19:50:21
 */
public interface SupportDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Support queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Support> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);



    List<All_Info> queryAll();

    /**
     * 新增数据
     *
     * @param support 实例对象
     * @return 影响行数
     */
    int insert(Support support);

    /**
     * 修改数据
     *
     * @param support 实例对象
     * @return 影响行数
     */
    int update(Support support);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}