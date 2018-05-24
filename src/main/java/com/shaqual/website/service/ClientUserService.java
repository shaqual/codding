package com.shaqual.website.service;

import com.shaqual.website.entity.User;

import java.util.List;
import java.util.Map;

/**
 * userService
 */
public interface ClientUserService {
    List<User> selectByPage(Map map);
}
