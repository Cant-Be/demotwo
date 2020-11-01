package com.zytwo.demotwo.user.service;

import com.zytwo.demotwo.user.dao.UserDao;
import com.zytwo.demotwo.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    //查
    @Override
    public List<UserEntity> getAll(Map map) {

        return userDao.getAll(map);
    }

    //删
    @Override
    public void delById(Integer id) {

        userDao.delById(id);
    }

    //增
    @Override
    public void save(UserEntity userEntity) {

        userEntity.setCreatetime(new Date());
        userEntity.setStatus(1);
        userDao.save(userEntity);
    }

}
