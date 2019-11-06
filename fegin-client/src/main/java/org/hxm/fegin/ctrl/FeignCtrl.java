package org.hxm.fegin.ctrl;

import org.hxm.fegin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : Aaron
 * create at:  2019-09-22  14:27
 * @description:
 */
@RestController
@RequestMapping("/reignCtrl")
public class FeignCtrl {

    @Autowired
    org.hxm.fegin.service.UserService userService;

    @RequestMapping("/user/{id}")
    public String getUser(@PathVariable("id") String id){

        System.out.println("id>>>>>>"+id);
        return userService.getUserById(id).toString();
    }
}

