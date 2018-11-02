package com.miles.demoservice.service.impl;

import com.miles.demoservice.dao.AppMapper;
import com.miles.demoservice.model.App;
import com.miles.demoservice.service.IAppService;
import com.miles.demoservice.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
* @author: Miles
* @date: 2018/10/31 15:30:14
* @description: App服务实现
*/
@Service
@Transactional
public class AppServiceImpl extends AbstractService<App> implements IAppService {
    @Resource
    private AppMapper appMapper;

}
