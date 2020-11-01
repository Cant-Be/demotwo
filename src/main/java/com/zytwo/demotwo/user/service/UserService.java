package com.zytwo.demotwo.user.service;

import com.zytwo.demotwo.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {
//查
    List<UserEntity> getAll(Map map);
//删
    void delById(Integer id);
//增
    public void save(UserEntity userEntity);
}
