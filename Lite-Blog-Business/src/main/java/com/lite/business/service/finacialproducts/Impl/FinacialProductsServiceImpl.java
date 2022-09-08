package com.lite.business.service.finacialproducts.Impl;

import com.lite.business.entity.finacialproducts.FinacialProducts;
import com.lite.business.dao.finacialproducts.FinacialProductsMapper;
import com.lite.business.service.finacialproducts.FinacialProductsService;
import com.lite.business.convert.finacialproducts.FinacialProductsConvert;

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
public class FinacialProductsServiceImpl extends ServiceImpl<FinacialProductsMapper, FinacialProducts> implements FinacialProductsService {


        @Autowired
        FinacialProductsMapper finacialproductsMapper;

        @Autowired
        FinacialProductsConvert finacialproductsConvert;

}
