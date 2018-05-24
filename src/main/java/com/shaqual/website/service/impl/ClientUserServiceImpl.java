package com.shaqual.website.service.impl;


import com.shaqual.website.dao.ClientUserMapper;
import com.shaqual.website.entity.User;
import com.shaqual.website.service.ClientUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ClientUserServiceImpl implements ClientUserService {
    @Autowired
    private ClientUserMapper clientUserDao;

    @Override
    public List<User> selectByPage(Map map) {
        return clientUserDao.selectByPage(map);
    }
}
