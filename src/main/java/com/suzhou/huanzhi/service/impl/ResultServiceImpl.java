package com.suzhou.huanzhi.service.impl;

import com.suzhou.huanzhi.dao.ResultDao;
import com.suzhou.huanzhi.entity.All_Info;
import com.suzhou.huanzhi.entity.Result;
import com.suzhou.huanzhi.service.ResultService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Result)表服务实现类
 *
 * @author makejava
 * @since 2020-09-23 19:50:08
 */
@Service("resultService")
public class ResultServiceImpl implements ResultService {
    @Resource
    private ResultDao resultDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Result queryById(Integer id) {
        return this.resultDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Result> queryAllByLimit(int offset, int limit) {
        return this.resultDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param result 实例对象
     * @return 实例对象
     */
    @Override
    public Result insert(Result result) {
        this.resultDao.insert(result);
        return result;
    }

    /**
     * 修改数据
     *
     * @param result 实例对象
     * @return 实例对象
     */
    @Override
    public Result update(Result result) {
        this.resultDao.update(result);
        return this.queryById(result.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.resultDao.deleteById(id) > 0;
    }

    @Override
    public List<All_Info> queryAll() {
        return this.resultDao.queryAll();
    }
}