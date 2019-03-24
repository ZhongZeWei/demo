package com.demo.mybatisPlus.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.demo.mybatisPlus.entity.User;
import com.demo.mybatisPlus.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController implements BaseController<User> {

    @Autowired
    private UserService userService;

    /**
     * <p>
     * 插入一条记录（选择字段，策略插入）
     * </p>
     *
     * @param entity 实体对象
     */
    @Override
    public boolean save(User entity) {
        return userService.save(entity);
    }

    @Override
    public boolean saveBatch(User entity) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<User> entityList) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean removeById(Serializable id) {
        return false;
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return false;
    }

    @Override
    public boolean remove(Wrapper<User> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(User entity) {
        return false;
    }

    @Override
    public boolean update(User entity, Wrapper<User> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(User entity) {
        return false;
    }

    @Override
    public User getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<User> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<User> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public User getOne(Wrapper<User> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public Object getObj(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public int count(Wrapper<User> queryWrapper) {
        return 0;
    }

    @Override
    public List<User> list(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public IPage<User> page(IPage<User> page, Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public List<Object> listObjs(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<User> page, Wrapper<User> queryWrapper) {
        return null;
    }

    @GetMapping("/list")
    @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    })

    @ApiResponses({
            @ApiResponse(code=200,message="请求响应成功"),
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=401,message="密码错误"),
            @ApiResponse(code=403,message="服务器拒绝访问"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    public List<User> findAll(Long id) {
        List<User> users = userService.list();
        return users;
    }


}
