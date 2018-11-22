package com.miles.demoservice.jobhandle;/**
 * Created by hozongman on 2018/11/12.
 */

import com.alibaba.fastjson.JSON;
import com.miles.demoservice.model.App;
import com.miles.demoservice.service.IAppService;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author Miles
 * @Data 2018/11/12 16:22
 */
@JobHandler("demoJobHandle")
@Component
@Slf4j
public class DemoJobHandle extends IJobHandler{

    @Autowired
    IAppService appServiceImpl;

    @Override
    public ReturnT<String> execute(String s) throws Exception {

        App app = appServiceImpl.findById(9);
        log.info("select data is : {}", JSON.toJSON(app));

        return SUCCESS;
    }
}
