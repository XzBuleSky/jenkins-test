package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 写点注释吧~
 *
 * @author liubaofeng
 * @date 2019/10/17
 */
@RestController
public class Test {


    @GetMapping("/")
    public String test() {
        return "Hello World | xiezijun-1018-10-34 | 测试版本更新15:441111123123123";
    }

}
