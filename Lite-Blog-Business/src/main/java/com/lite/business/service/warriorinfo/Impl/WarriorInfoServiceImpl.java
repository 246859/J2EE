package com.lite.business.service.warriorinfo.Impl;

import com.lite.business.entity.warriorinfo.WarriorInfo;
import com.lite.business.dao.warriorinfo.WarriorInfoMapper;
import com.lite.business.service.warriorinfo.WarriorInfoService;
import com.lite.business.convert.warriorinfo.WarriorInfoConvert;

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
public class WarriorInfoServiceImpl extends ServiceImpl<WarriorInfoMapper, WarriorInfo> implements WarriorInfoService {


        @Autowired
        WarriorInfoMapper warriorinfoMapper;

        @Autowired
        WarriorInfoConvert warriorinfoConvert;

}
