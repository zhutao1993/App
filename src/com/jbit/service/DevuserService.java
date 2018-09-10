package com.jbit.service;

import com.jbit.entity.DevUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/9/4.
 */

public interface DevuserService {
    DevUser findUser( String devcode, String devPassword);



}
