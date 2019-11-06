package org.hxm.ribbon.org.hxm.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Aaron
 * create at:  2019-08-25  14:18
 * @description: test ribbon
 */
@RestController
public class TestCtrl {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/test/{id}")
    public String hi(@PathVariable("id") String id){
        System.out.println("1111");
        return restTemplate.getForObject("http://ORDER-SERVER/test/getOrderById/"+id,String.class);
    }
}

