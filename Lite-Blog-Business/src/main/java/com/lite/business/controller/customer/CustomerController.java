package com.lite.business.controller.customer;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
    import com.lite.business.convert.customer.CustomerConvert;
import com.lite.business.service.customer.CustomerService;

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
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerConvert customerConvert;

}
