package com.stu.manage.demo.service.impl;


import com.stu.manage.demo.mapper.LoginMapper;
import com.stu.manage.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shr
 */

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public String getAdmin(String name){
        return loginMapper.getAdmin(name);
    }
    @Override
    public boolean getCharacter(String name){ return  loginMapper.getCharacter(name);}
}
