package com.example.bootdocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO(用一句话描述该文件做什么)
 *
 * @version 1.0
 * @author: wuzhicheng
 * @date: 2019/08/24 14:33
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/say")
    public String string(String name) {
        return "dongcidaci :"+name;
    }
}
