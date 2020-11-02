package com.suzhou.huanzhi.service.impl;

import com.suzhou.huanzhi.dao.HBDao;
import com.suzhou.huanzhi.entity.HB;
import com.suzhou.huanzhi.service.HBService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (HB)表服务实现类
 *
 * @author makejava
 * @since 2020-11-01 14:14:01
 */
@Service("hBService")
public class HBServiceImpl implements HBService {
    @Resource
    private HBDao hBDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public HB queryById(Integer id) {
        return this.hBDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<HB> queryAllByLimit(int offset, int limit) {
        return this.hBDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param hB 实例对象
     * @return 实例对象
     */
    @Override
    public HB insert(HB hB) {
        this.hBDao.insert(hB);
        return hB;
    }

    /**
     * 修改数据
     *
     * @param hB 实例对象
     * @return 实例对象
     */
    @Override
    public HB update(HB hB) {
        this.hBDao.update(hB);
        return this.queryById(hB.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.hBDao.deleteById(id) > 0;
    }

    @Override
    public List<HB> queryAll() {
        return this.hBDao.queryAll(null);
    }
}