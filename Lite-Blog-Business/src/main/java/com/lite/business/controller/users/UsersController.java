package com.lite.business.controller.users;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
    import com.lite.business.convert.users.UsersConvert;
import com.lite.business.service.users.UsersService;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    UsersService usersService;

    @Autowired
    UsersConvert usersConvert;

}
