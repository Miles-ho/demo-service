package com.laika.demoservice.service.impl;

import com.laika.demoservice.dao.AppMapper;
import com.laika.demoservice.model.App;
import com.laika.demoservice.service.IAppService;
import com.laika.demoservice.core.AbstractService;
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
