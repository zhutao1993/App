package com.jbit.controller;

import com.jbit.service.DevuserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/9/4.
 */
@Controller
@RequestMapping("/devuser")
public class DevUserController {
    @Resource
    private DevuserService devuserService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String finduser(String devcode, String devpassword, HttpSession session, Model model){
        if(devuserService.findUser(devcode,devpassword)!=null){
            session.setAttribute("devUserSession",devuserService.findUser(devcode, devpassword));
            return "redirect:/jsp/developer/main.jsp";
        };
        model.addAttribute("error","用户名或密码错误");
        return "jsp/devlogin";
    }
    @RequestMapping("/regist")
    public String regist(HttpSession session){
        session.invalidate();
        return "jsp/devlogin";
    }


}
