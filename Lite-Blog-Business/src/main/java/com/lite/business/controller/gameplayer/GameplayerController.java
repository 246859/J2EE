package com.lite.business.controller.gameplayer;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
    import com.lite.business.convert.gameplayer.GameplayerConvert;
import com.lite.business.service.gameplayer.GameplayerService;

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
@RequestMapping("/gameplayer")
public class GameplayerController {
    @Autowired
    GameplayerService gameplayerService;

    @Autowired
    GameplayerConvert gameplayerConvert;

}
