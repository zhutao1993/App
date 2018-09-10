package com.jbit.service;

import com.jbit.entity.AppInfo;
import com.jbit.entity.DataDictionary;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Administrator on 2018/9/6.
 */
public interface DataDictionaryService {
    List<AppInfo> findlist( String querySoftwareName, Long queryStatus, Long queryCategoryLevel1, Long queryFlatformId, Long queryCategoryLevel2, Long queryCategoryLevel3 );

    List<DataDictionary> findPing();
    List<DataDictionary> findTypeName();
}
