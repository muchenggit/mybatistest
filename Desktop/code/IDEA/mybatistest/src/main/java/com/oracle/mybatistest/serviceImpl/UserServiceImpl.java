package com.oracle.mybatistest.serviceImpl;

import com.oracle.mybatistest.dao.UserDao;
import com.oracle.mybatistest.po.User;
import com.oracle.mybatistest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
   private UserDao userDao;
    @Override
   public User find(int id){
        System.out.print("UserServiceImpl==>>");
        return userDao.findById(id);
    }
}
