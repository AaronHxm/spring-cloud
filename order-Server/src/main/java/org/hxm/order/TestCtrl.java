package org.hxm.order;

import org.hxm.order.dto.UserDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Aaron
 * create at:  2019-08-24  14:08
 * @description: test controller
 */
@RestController
@RequestMapping("/test")
public class TestCtrl {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "/getOrderById/{id}")
    public String getOrderByID(@PathVariable("id") int id){


        return "hi " + id + " ,i am from port:" + port;
    }

    @GetMapping(value = "/getUserByID/{id}")
    public UserDto getUserByID(@PathVariable("id") int id){

        System.out.println("id>>>>>"+id);

        return new UserDto(id+"",id+"xxx",18,"男");
    }

}

