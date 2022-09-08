package com.lite.business.controller.magicianinfo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
    import com.lite.business.convert.magicianinfo.MagicianInfoConvert;
import com.lite.business.service.magicianinfo.MagicianInfoService;

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
@RequestMapping("/magician-info")
public class MagicianInfoController {
    @Autowired
    MagicianInfoService magicianinfoService;

    @Autowired
    MagicianInfoConvert magicianinfoConvert;

}
