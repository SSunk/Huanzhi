package com.suzhou.huanzhi.service.impl;

import com.suzhou.huanzhi.dao.CaiwuDao;
import com.suzhou.huanzhi.entity.All_Info;
import com.suzhou.huanzhi.entity.Caiwu;
import com.suzhou.huanzhi.service.CaiwuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Caiwu)表服务实现类
 *
 * @author makejava
 * @since 2020-09-23 19:49:54
 */
@Service("caiwuService")
public class CaiwuServiceImpl implements CaiwuService {
    @Resource
    private CaiwuDao caiwuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Caiwu queryById(Integer id) {
        return this.caiwuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Caiwu> queryAllByLimit(int offset, int limit) {
        return this.caiwuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param caiwu 实例对象
     * @return 实例对象
     */
    @Override
    public Caiwu insert(Caiwu caiwu) {
        this.caiwuDao.insert(caiwu);
        return caiwu;
    }

    /**
     * 修改数据
     *
     * @param caiwu 实例对象
     * @return 实例对象
     */
    @Override
    public Caiwu update(Caiwu caiwu) {
        this.caiwuDao.update(caiwu);
        return this.queryById(caiwu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.caiwuDao.deleteById(id) > 0;
    }

    @Override
    public List<All_Info> queryAll() {
        return this.caiwuDao.queryAll();
    }
}