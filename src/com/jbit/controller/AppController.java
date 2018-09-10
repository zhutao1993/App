package com.jbit.controller;

import com.jbit.entity.AppCategory;
import com.jbit.service.AppCategoryService;
import com.jbit.service.DataDictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by Administrator on 2018/9/6.
 */
@Controller
@RequestMapping("/app")
public class AppController {
    @Resource
    private DataDictionaryService dataDictionaryService;
    @Resource
    private AppCategoryService appCategoryService;
    @RequestMapping("/list")
    public String list(Model model, @RequestParam(required = false) String querySoftwareName,
                       @RequestParam(required = false) Long queryStatus,
                       @RequestParam(required = false)  Long queryCategoryLevel1,
                       @RequestParam(required = false) Long queryFlatformId,
                       @RequestParam(required = false) Long queryCategoryLevel2,
                       @RequestParam(required = false) Long queryCategoryLevel3 ){
        model.addAttribute("categoryLevel1List",appCategoryService.findbypid(null));
        model.addAttribute("flatFormList",dataDictionaryService.findPing());
        model.addAttribute("statusList" ,dataDictionaryService.findTypeName());
        model.addAttribute("appInfoList", dataDictionaryService.findlist(querySoftwareName,queryStatus,queryCategoryLevel1,queryFlatformId,queryCategoryLevel2,queryCategoryLevel3));
        return "jsp/developer/appinfolist";
    }
    @RequestMapping("/two")
    @ResponseBody
    public Object two(Long pid,Model model){
        List<AppCategory> list= appCategoryService.findbypid(pid);

        return  list;
    }
    @RequestMapping("/three")
    @ResponseBody
    public Object three(Long pid){
        List<AppCategory> list= appCategoryService.findbypid(pid);

        return  list;
    }


}
