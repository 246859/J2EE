package com.lite.business.controller.warriorinfo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
    import com.lite.business.convert.warriorinfo.WarriorInfoConvert;
import com.lite.business.service.warriorinfo.WarriorInfoService;

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
@RequestMapping("/warrior-info")
public class WarriorInfoController {
    @Autowired
    WarriorInfoService warriorinfoService;

    @Autowired
    WarriorInfoConvert warriorinfoConvert;

}
