package com.example.demo.service.impl;

import com.example.demo.service.UserServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by song on 2017/8/26.
 */
@Service
public class UserServiceImpl implements UserServce {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void test(){
        System.out.println("service");
        System.out.println(jdbcTemplate);
    }
}
