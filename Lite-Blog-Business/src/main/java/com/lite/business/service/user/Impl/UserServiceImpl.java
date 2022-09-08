package com.lite.business.service.user.Impl;

import com.lite.business.entity.user.User;
import com.lite.business.dao.user.UserMapper;
import com.lite.business.service.user.UserService;
import com.lite.business.convert.user.UserConvert;

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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


        @Autowired
        UserMapper userMapper;

        @Autowired
        UserConvert userConvert;

}
