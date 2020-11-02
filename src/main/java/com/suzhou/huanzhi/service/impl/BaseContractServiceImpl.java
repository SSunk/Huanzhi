package com.suzhou.huanzhi.service.impl;

import com.suzhou.huanzhi.dao.BaseContractDao;
import com.suzhou.huanzhi.entity.All_Info;
import com.suzhou.huanzhi.entity.BaseContract;
import com.suzhou.huanzhi.service.BaseContractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BaseContract)表服务实现类
 *
 * @author makejava
 * @since 2020-09-23 19:49:34
 */
@Service("baseContractService")
public class BaseContractServiceImpl implements BaseContractService {
    @Resource
    private BaseContractDao baseContractDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BaseContract queryById(Integer id) {
        return this.baseContractDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BaseContract> queryAllByLimit(int offset, int limit) {
        return this.baseContractDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param baseContract 实例对象
     * @return 实例对象
     */
    @Override
    public BaseContract insert(BaseContract baseContract) {
        this.baseContractDao.insert(baseContract);
        return baseContract;
    }

    /**
     * 修改数据
     *
     * @param baseContract 实例对象
     * @return 实例对象
     */
    @Override
    public BaseContract update(BaseContract baseContract) {
        this.baseContractDao.update(baseContract);
        return this.queryById(baseContract.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.baseContractDao.deleteById(id) > 0;
    }

    @Override
    public List<All_Info> queryAll() {
        return null;
    }

    @Override
    public BaseContract getLastContract() {
        return this.baseContractDao.getLastContract();
    }
}