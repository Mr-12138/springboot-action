package com.halo.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by gyb on 2021/3/25
 */
@RestController
public class ActionController {


    @RequestMapping("/hello")
    public String hello() {
        return "action hello";
    }


    public String action() {
        return "1233456";
    }
}
