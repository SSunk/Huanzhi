package com.suzhou.huanzhi.service.impl;

import com.suzhou.huanzhi.dao.HADao;
import com.suzhou.huanzhi.entity.HA;
import com.suzhou.huanzhi.service.HAService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (HA)表服务实现类
 *
 * @author makejava
 * @since 2020-11-01 14:13:42
 */
@Service("hAService")
public class HAServiceImpl implements HAService {
    @Resource
    private HADao hADao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public HA queryById(Integer id) {
        return this.hADao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<HA> queryAllByLimit(int offset, int limit) {
        return this.hADao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param hA 实例对象
     * @return 实例对象
     */
    @Override
    public HA insert(HA hA) {
        this.hADao.insert(hA);
        return hA;
    }

    /**
     * 修改数据
     *
     * @param hA 实例对象
     * @return 实例对象
     */
    @Override
    public HA update(HA hA) {
        this.hADao.update(hA);
        return this.queryById(hA.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.hADao.deleteById(id) > 0;
    }

    @Override
    public List<HA> queryAll() {
        return this.hADao.queryAll(null);
    }
}