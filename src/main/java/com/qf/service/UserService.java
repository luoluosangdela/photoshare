package com.qf.service;

import com.qf.pojo.TUser;

public interface UserService {
    int addUser(TUser tuser );
    TUser userlogin(String username,String userpwd);
}
