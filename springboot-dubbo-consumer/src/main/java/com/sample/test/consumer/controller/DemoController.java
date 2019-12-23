/**
 * FileName: DemoController
 * Author:   huang.yj
 * Date:     2019/12/23 16:10
 * Description:
 */
package com.sample.test.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sample.test.api.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈〉
 *
 * @author huang.yj
 * @create 2019/12/23
 * @since 0.0.1
 */
@Slf4j
@RestController
public class DemoController {

    // 通过@Reference注解从dubbo引入需要的服务
    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    @GetMapping("/say/{name}")
    public String sayHello(@PathVariable("name") String name) {
        log.info("获取参数name={}",name);
        return demoService.sayHello(name);
    }
}