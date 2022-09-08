package com.lite.business.service.customer.Impl;

import com.lite.business.entity.customer.Customer;
import com.lite.business.dao.customer.CustomerMapper;
import com.lite.business.service.customer.CustomerService;
import com.lite.business.convert.customer.CustomerConvert;

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
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {


        @Autowired
        CustomerMapper customerMapper;

        @Autowired
        CustomerConvert customerConvert;

}
