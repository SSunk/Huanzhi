package com.suzhou.huanzhi.service.impl;

import com.suzhou.huanzhi.dao.ManageDao;
import com.suzhou.huanzhi.entity.Manage;
import com.suzhou.huanzhi.service.ManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Manage)表服务实现类
 *
 * @author makejava
 * @since 2020-09-23 23:46:28
 */
@Service("manageService")
public class ManageServiceImpl implements ManageService {
    @Resource
    private ManageDao manageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Manage queryById(Integer id) {
        return this.manageDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Manage> queryAllByLimit(int offset, int limit) {
        return this.manageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param manage 实例对象
     * @return 实例对象
     */
    @Override
    public Manage insert(Manage manage) {
        this.manageDao.insert(manage);
        return manage;
    }

    /**
     * 修改数据
     *
     * @param manage 实例对象
     * @return 实例对象
     */
    @Override
    public Manage update(Manage manage) {
        this.manageDao.update(manage);
        return this.queryById(manage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.manageDao.deleteById(id) > 0;
    }

    @Override
    public List<Manage> queryAll() {
        return this.manageDao.queryAll();
    }
}