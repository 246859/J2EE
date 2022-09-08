package com.lite.business.controller.finacialproducts;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
    import com.lite.business.convert.finacialproducts.FinacialProductsConvert;
import com.lite.business.service.finacialproducts.FinacialProductsService;

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
@RequestMapping("/finacial-products")
public class FinacialProductsController {
    @Autowired
    FinacialProductsService finacialproductsService;

    @Autowired
    FinacialProductsConvert finacialproductsConvert;

}
