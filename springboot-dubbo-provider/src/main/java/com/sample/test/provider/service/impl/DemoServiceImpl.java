/**
 * FileName: DemoServiceImpl
 * Author:   huang.yj
 * Date:     2019/12/23 15:49
 * Description:
 */
package com.sample.test.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sample.test.api.DemoService;
import lombok.extern.slf4j.Slf4j;

/**
 * 〈实现api模块中的接口，以下是api接口的具体实现方法〉
 *
 * @author huang.yj
 * @create 2019/12/23
 * @since 0.0.1
 */
@Slf4j
@Service(version = "${demo.service.version}") // 添加alibaba的dubbo的@Service注解
public class DemoServiceImpl implements DemoService {
    /**
     * 实现api模块中的sayHello接口
     * @param name
     * @return
     */
    @Override
    public String sayHello(String name) {
        log.info("sayHello方法进入，name={}",name);
        return "Hello,"+ name;
    }
}