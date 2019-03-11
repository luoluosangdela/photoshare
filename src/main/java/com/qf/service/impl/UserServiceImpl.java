package com.qf.service.impl;

import com.qf.dao.TUserMapper;
import com.qf.pojo.TUser;
import com.qf.service.UserService;
import com.qf.util.EncryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TUserMapper  userMapper;
    @Override
    public int addUser(TUser tuser) {
        tuser.setUserpwd(EncryptUtil.md5Enc(tuser.getUserpwd()));
        return userMapper.insertSelective(tuser);
    }

    @Override
    public TUser userlogin(String username, String userpwd) {
        TUser user=userMapper.findUserByName(username);
        if(user!=null){
            if(Objects.equals(user.getUserpwd(),EncryptUtil.md5Enc(userpwd))){
                return  user;
            }
        }
        return null;
    }
}
