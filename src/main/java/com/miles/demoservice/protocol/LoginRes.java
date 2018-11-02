package com.miles.demoservice.protocol;

import com.miles.demoservice.model.Customer;
import com.miles.demoservice.utils.StringUtil;
import lombok.Data;

/**
 * @author: 会跳舞的机器人
 * @date: 17/12/16 上午11:34
 * @description: 登录返回
 */
@Data
public class LoginRes {
    private String customerCode;

    private String mobile;

    private String agentCode;


    public static LoginRes buildByCustomer(Customer customer) {
        LoginRes loginRes = new LoginRes();
        if (customer == null) {
            return loginRes;
        }
        loginRes.setCustomerCode(customer.getCustomerCode());
        loginRes.setMobile(StringUtil.encodeMobile(customer.getMobile()));
        loginRes.setAgentCode(customer.getAgentCode());
        return loginRes;
    }
}
