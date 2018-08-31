package cn.sunguolei.qa.springboot.template.controller;

import cn.sunguolei.qa.springboot.template.entity.ReturnedResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public ReturnedResult<String> hello() {
        String hello = "Welcome to our Home, Happy for you!";
        return ReturnedResult.success(hello);
    }

    @GetMapping("world")
    public ReturnedResult<String> world() {
        String world = "Error, anyway, welcome to Home!";
        return ReturnedResult.fail(10001, world);
    }
}
