package org.hxm.fegin.service;

import org.hxm.fegin.dto.UserDto;
import org.springframework.stereotype.Component;

/**
 * @author : Aaron
 * create at:  2019-09-22  17:30
 * @description: aa
 */
@Component
public class UserServiceHystrix implements UserService {
    @Override
    public UserDto getUserById(String id) {
        return null;
    }
}

