package com.dhcc.demo.module.user.service;

import com.dhcc.demo.module.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author guogang
 * @since 2020-12-05
 */
public interface IUserService extends IService<User> {

    /**
     * 查询分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<User>
     */
    IPage<User> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加
     *
     * @param user 
     * @return int
     */
    int add(User user);

    /**
     * 删除
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改
     *
     * @param user 
     * @return int
     */
    int updateData(User user);

    /**
     * id查询数据
     *
     * @param id id
     * @return User
     */
    User findById(Long id);
}
