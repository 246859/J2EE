package com.lite.business.service.users.Impl;

import com.lite.business.entity.users.Users;
import com.lite.business.dao.users.UsersMapper;
import com.lite.business.service.users.UsersService;
import com.lite.business.convert.users.UsersConvert;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {


        @Autowired
        UsersMapper usersMapper;

        @Autowired
        UsersConvert usersConvert;

}
