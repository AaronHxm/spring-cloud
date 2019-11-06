package org.hxm.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : Aaron
 * create at:  2019-08-25  16:26
 * @description: fegin application
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class FeginApplication {
    public static void main(String[] args) {

        SpringApplication.run(FeginApplication.class, args);

    }
}

