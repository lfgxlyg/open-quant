package com.open.quant.service.impl;

import com.open.quant.domain.beans.User;
import com.open.quant.domain.query.UserQuery;
import com.open.quant.mapper.UserMapper;
import com.open.quant.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yonggangli on 2016/8/24.
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(String uname, String upwd) {
        User user = new User();
        user.setUname(uname);
        user.setUpwd(upwd);
        userMapper.insertUser(user);
    }

    @Override
    public int queryUserTotalRows(String uname, String upwd) {
        UserQuery userQuery = new UserQuery();
        userQuery.setUname(uname);
        userQuery.setUpwd(upwd);
        return userMapper.queryUserTotalRows(userQuery);
    }
}
