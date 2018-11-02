package com.miles.demoservice.controller.toC;


import com.miles.demoservice.controller.BaseController;
import com.miles.demoservice.core.api.ApiResult;
import com.miles.demoservice.core.api.ApiResultGenerator;
import com.miles.demoservice.model.Customer;
import com.miles.demoservice.protocol.LoginRes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: 会跳舞的机器人
 * @date: 17/12/16 上午11:23
 * @description: 用户登录 注册 找回密码
 */
@Controller
@RequestMapping("/user")
public class LoginController extends BaseController {


    /**
     * 用户登录
     *
     * @param loginReq
     * @return
     */
    @GetMapping("/login")
    @ResponseBody
    public ApiResult login() {


        return ApiResultGenerator.success(LoginRes.buildByCustomer(new Customer()));
    }
}
