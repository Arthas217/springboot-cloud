package com.beijing.consumeruser.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author zc217
 * @Date 2020/10/21
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    /**
     * http://localhost:8200/user/buy?name=自己
     */
    @GetMapping("/user/buy")
    public String buyTicket(String name){
        String template = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name + "购买了" + template;
    }
}
