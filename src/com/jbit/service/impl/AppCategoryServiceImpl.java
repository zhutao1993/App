package com.jbit.service.impl;

import com.jbit.dao.AppCategoryMapper;
import com.jbit.entity.AppCategory;
import com.jbit.service.AppCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/9/8.
 */
@Service("appCategoryService")
public class AppCategoryServiceImpl implements AppCategoryService {
    @Resource
    private AppCategoryMapper appCategoryMapper;

    @Override
    public List<AppCategory> findbypid(Long pid) {
        return appCategoryMapper.findbypid(pid);
    }
}
