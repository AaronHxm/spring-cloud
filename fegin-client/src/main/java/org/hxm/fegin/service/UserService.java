package org.hxm.fegin.service;

import feign.Param;
import org.hxm.fegin.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "order-server",fallback = UserServiceHystrix.class)
public interface UserService {
    @RequestMapping(value = "/test/getUserByID/{id}",method = RequestMethod.GET)
    UserDto getUserById(@PathVariable("id") String id);


//   // int saveUserDto(UserDto userDto);


}
