package com.suzhou.huanzhi.dao;

import com.suzhou.huanzhi.entity.BaseContract;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (BaseContract)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-23 19:49:33
 */
public interface BaseContractDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BaseContract queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BaseContract> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param baseContract 实例对象
     * @return 对象列表
     */
    List<BaseContract> queryAll(BaseContract baseContract);

    /**
     * 新增数据
     *
     * @param baseContract 实例对象
     * @return 影响行数
     */
    int insert(BaseContract baseContract);

    /**
     * 修改数据
     *
     * @param baseContract 实例对象
     * @return 影响行数
     */
    int update(BaseContract baseContract);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    BaseContract getLastContract();
}