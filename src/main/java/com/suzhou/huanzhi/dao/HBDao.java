package com.suzhou.huanzhi.dao;

import com.suzhou.huanzhi.entity.HB;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (HB)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-01 14:14:01
 */
public interface HBDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    HB queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<HB> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param hB 实例对象
     * @return 对象列表
     */
    List<HB> queryAll(HB hB);

    /**
     * 新增数据
     *
     * @param hB 实例对象
     * @return 影响行数
     */
    int insert(HB hB);

    /**
     * 修改数据
     *
     * @param hB 实例对象
     * @return 影响行数
     */
    int update(HB hB);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}