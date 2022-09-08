package com.lite.business.service.product.Impl;

import com.lite.business.entity.product.Product;
import com.lite.business.dao.product.ProductMapper;
import com.lite.business.service.product.ProductService;
import com.lite.business.convert.product.ProductConvert;

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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {


        @Autowired
        ProductMapper productMapper;

        @Autowired
        ProductConvert productConvert;

}
