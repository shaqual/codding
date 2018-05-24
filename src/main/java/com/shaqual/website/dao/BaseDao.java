package com.shaqual.website.dao;

import com.shaqual.website.entity.BaseEntity;

import java.util.List;
import java.util.Map;

public interface BaseDao {
    List<BaseEntity> selectByPage(Map map);
}
