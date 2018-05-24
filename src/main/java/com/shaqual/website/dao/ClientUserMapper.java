package com.shaqual.website.dao;

import com.shaqual.website.entity.User;

import java.util.List;
import java.util.Map;

public interface ClientUserMapper{
    List<User> selectByPage(Map map);
}
