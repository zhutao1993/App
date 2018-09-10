package com.jbit.service.impl;

import com.jbit.dao.AppInfoMapper;
import com.jbit.dao.DataDictionaryMapper;
import com.jbit.entity.AppInfo;
import com.jbit.entity.DataDictionary;
import com.jbit.service.DataDictionaryService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import java.security.PrivateKey;
import java.util.List;

/**
 * Created by Administrator on 2018/9/6.
 */
@Service("dataDictionaryService")
public class DataDictionaryServiceImpl implements DataDictionaryService {
    @Resource
    private DataDictionaryMapper dataDictionaryMapper;
    @Resource
    private AppInfoMapper appInfoMapper;

    @Override
    public List<AppInfo> findlist(String querySoftwareName, Long queryStatus, Long queryCategoryLevel1, Long queryFlatformId, Long queryCategoryLevel2, Long queryCategoryLevel3 ) {
        return appInfoMapper.findlist(querySoftwareName,queryStatus,queryCategoryLevel1,queryFlatformId,queryCategoryLevel2,queryCategoryLevel3);
    }

    @Override
    public List<DataDictionary> findPing() {
        return dataDictionaryMapper.findPing();
    }


    @Override
    public List<DataDictionary> findTypeName() {

        return  dataDictionaryMapper.findTypeName();
    }
}
