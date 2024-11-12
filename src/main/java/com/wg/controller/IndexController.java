package com.wg.controller;

import com.wg.common.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import com.wg.utils.TimeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "index接口")
@RestController
@Slf4j
public class IndexController{

    @ApiOperation("接口测试")
    @GetMapping("/getTest1")
    public Result test1(){
        String currentTime = TimeUtils.getCurrentTime();
        String data="this is test!";
        log.info("测试:{}",currentTime);
        return Result.ok("hello,"+currentTime);
    }
}
