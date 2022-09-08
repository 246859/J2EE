package com.lite.business.service.gameplayer.Impl;

import com.lite.business.entity.gameplayer.Gameplayer;
import com.lite.business.dao.gameplayer.GameplayerMapper;
import com.lite.business.service.gameplayer.GameplayerService;
import com.lite.business.convert.gameplayer.GameplayerConvert;

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
public class GameplayerServiceImpl extends ServiceImpl<GameplayerMapper, Gameplayer> implements GameplayerService {


        @Autowired
        GameplayerMapper gameplayerMapper;

        @Autowired
        GameplayerConvert gameplayerConvert;

}
