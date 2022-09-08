package com.lite.business.service.batchdetail.Impl;

import com.lite.business.entity.batchdetail.Batchdetail;
import com.lite.business.dao.batchdetail.BatchdetailMapper;
import com.lite.business.service.batchdetail.BatchdetailService;
import com.lite.business.convert.batchdetail.BatchdetailConvert;

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
public class BatchdetailServiceImpl extends ServiceImpl<BatchdetailMapper, Batchdetail> implements BatchdetailService {


        @Autowired
        BatchdetailMapper batchdetailMapper;

        @Autowired
        BatchdetailConvert batchdetailConvert;

}
