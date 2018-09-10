package com.jbit.service.impl;

import com.jbit.dao.DevUserMapper;
import com.jbit.entity.DevUser;
import com.jbit.service.DevuserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/9/4.
 */
@Service("devuserService")
public class DevuserServiceImpl implements DevuserService {
    @Resource
    private DevUserMapper devUserMapper;
    @Override
    public DevUser findUser(String devcode, String devPassword) {

        return devUserMapper.findUser(devcode, devPassword);
    }
}
