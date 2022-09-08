package com.lite.business.service.promappingusr.Impl;

import com.lite.business.entity.promappingusr.ProMappingUsr;
import com.lite.business.dao.promappingusr.ProMappingUsrMapper;
import com.lite.business.service.promappingusr.ProMappingUsrService;
import com.lite.business.convert.promappingusr.ProMappingUsrConvert;

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
public class ProMappingUsrServiceImpl extends ServiceImpl<ProMappingUsrMapper, ProMappingUsr> implements ProMappingUsrService {


        @Autowired
        ProMappingUsrMapper promappingusrMapper;

        @Autowired
        ProMappingUsrConvert promappingusrConvert;

}
