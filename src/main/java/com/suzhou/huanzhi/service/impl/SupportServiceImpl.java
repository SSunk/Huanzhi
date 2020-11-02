package com.suzhou.huanzhi.service.impl;

import com.suzhou.huanzhi.dao.SupportDao;
import com.suzhou.huanzhi.entity.All_Info;
import com.suzhou.huanzhi.entity.Support;
import com.suzhou.huanzhi.service.SupportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Support)表服务实现类
 *
 * @author makejava
 * @since 2020-09-23 19:50:21
 */
@Service("supportService")
public class SupportServiceImpl implements SupportService {
    @Resource
    private SupportDao supportDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Support queryById(Integer id) {
        return this.supportDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Support> queryAllByLimit(int offset, int limit) {
        return this.supportDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param support 实例对象
     * @return 实例对象
     */
    @Override
    public Support insert(Support support) {
        this.supportDao.insert(support);
        return support;
    }

    /**
     * 修改数据
     *
     * @param support 实例对象
     * @return 实例对象
     */
    @Override
    public Support update(Support support) {
        this.supportDao.update(support);
        return this.queryById(support.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.supportDao.deleteById(id) > 0;
    }

    @Override
    public List<All_Info> queryAll() {
        return this.supportDao.queryAll();
    }
}