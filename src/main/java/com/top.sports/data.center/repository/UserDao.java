package com.top.sports.data.center.repository;

import java.util.List;
import java.util.Map;
import com.top.sports.data.center.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {

    List<User> getByMap(Map<String, Object> map);

    User getById(Integer id);

    Integer create(User user);

    int update(User user);

    int delete(Integer id);
}