package com.yt.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by MrLee on 2018/1/17.
 */
@Controller
public class CommonController {

    @RequestMapping("/getUserName")
    @ResponseBody
    public String getUserName(String id){
        return "".equals(id) ? "" : "admin";
    }

}
