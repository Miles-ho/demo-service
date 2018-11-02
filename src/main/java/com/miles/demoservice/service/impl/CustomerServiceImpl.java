package com.miles.demoservice.service.impl;

import com.miles.demoservice.dao.CustomerMapper;
import com.miles.demoservice.model.Customer;
import com.miles.demoservice.service.ICustomerService;
import com.miles.demoservice.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
* @author: 会跳舞的机器人
* @date: 2017/12/21 13:58:15
* @description: Customer服务实现
*/
@Service
@Transactional(rollbackFor =  Exception.class)
public class CustomerServiceImpl extends AbstractService<Customer> implements ICustomerService {
    @Resource
    private CustomerMapper tCustomerMapper;

}
