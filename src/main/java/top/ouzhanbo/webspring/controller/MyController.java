package top.ouzhanbo.webspring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author zhanxiangOu
 * @date 2021年12月23日15:14
 */

@Controller
public class MyController{


    @Resource
    ApplicationContext applicationContext;

    @RequestMapping(value="/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

}