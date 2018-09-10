package com.jbit.service;

import com.jbit.entity.AppCategory;
import com.jbit.entity.AppInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/9/8.
 */
public interface AppCategoryService {

    List<AppCategory> findbypid(Long pid);


}
