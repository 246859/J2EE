package com.lite.business.service.batch.Impl;

import com.lite.business.entity.batch.Batch;
import com.lite.business.dao.batch.BatchMapper;
import com.lite.business.service.batch.BatchService;
import com.lite.business.convert.batch.BatchConvert;

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
public class BatchServiceImpl extends ServiceImpl<BatchMapper, Batch> implements BatchService {


        @Autowired
        BatchMapper batchMapper;

        @Autowired
        BatchConvert batchConvert;

}
