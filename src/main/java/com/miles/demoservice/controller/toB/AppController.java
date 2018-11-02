package com.miles.demoservice.controller.toB;

import com.miles.demoservice.core.api.ApiResult;
import com.miles.demoservice.core.api.ApiResultGenerator;
import com.miles.demoservice.model.App;
import com.miles.demoservice.service.IAppService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Miles
 * @date: 2018/10/31 15:30:14
 * @description: App控制器
 */
@RestController
@RequestMapping("/app")
@Slf4j
public class AppController {

    @Resource
    private IAppService appService;


    /**
     * 新增App
     */
    @PostMapping("/add")
    public ApiResult add(App app) {
        boolean flag = appService.save(app);
        if (!flag) {
            return ApiResultGenerator.badParameter("新增失败！");
        }
        return ApiResultGenerator.success();
    }

    /**
     * 删除App
     */
    @DeleteMapping("/delete")
    public ApiResult delete(@RequestParam Integer id) {
        boolean flag = appService.deleteById(id);
        if (!flag) {
            return ApiResultGenerator.badParameter("被删除对象不存在！");
        }
        return ApiResultGenerator.success();
    }

    /**
     * 更新App
     */
    @PutMapping("/update")
    public ApiResult update(App app) {
        boolean flag = appService.update(app);
        if (!flag) {
            return ApiResultGenerator.badParameter("更新失败！");
        }
        return ApiResultGenerator.success();
    }

    /**
     * App详情
     */
    @GetMapping("/detail")
    public ApiResult detail(@RequestParam Integer id) {
        App app = appService.findById(id);
        if (app == null) {
            return ApiResultGenerator.badParameter("查找对象不存在！");
        }
        return ApiResultGenerator.success(app);
    }

    /**
     * App分页列表
     *
     * @param pageNum 页码
     * @param pageSize 每页记录数
     */
    @GetMapping("/pageList")
    public ApiResult pageList(App app, @RequestParam(defaultValue = "0") Integer pageNum,
        @RequestParam(defaultValue = "0") Integer pageSize) {
        // 分页d
        PageHelper.startPage(pageNum, pageSize);
        // 增加查询条件，criteria.andCondition("xxxx");

        log.debug("app 实体参数：[{}]", app.toString());
        Condition condition = new Condition(App.class);
        Example.Criteria criteria = condition.createCriteria();

        List<App> list = appService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ApiResultGenerator.success(pageInfo);
    }
}
