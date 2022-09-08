package com.lite.business.service.magicianinfo.Impl;

import com.lite.business.entity.magicianinfo.MagicianInfo;
import com.lite.business.dao.magicianinfo.MagicianInfoMapper;
import com.lite.business.service.magicianinfo.MagicianInfoService;
import com.lite.business.convert.magicianinfo.MagicianInfoConvert;

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
public class MagicianInfoServiceImpl extends ServiceImpl<MagicianInfoMapper, MagicianInfo> implements MagicianInfoService {


        @Autowired
        MagicianInfoMapper magicianinfoMapper;

        @Autowired
        MagicianInfoConvert magicianinfoConvert;

}
