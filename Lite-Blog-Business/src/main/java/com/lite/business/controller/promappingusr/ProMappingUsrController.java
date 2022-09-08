package com.lite.business.controller.promappingusr;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
    import com.lite.business.convert.promappingusr.ProMappingUsrConvert;
import com.lite.business.service.promappingusr.ProMappingUsrService;

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
@RequestMapping("/pro-mapping-usr")
public class ProMappingUsrController {
    @Autowired
    ProMappingUsrService promappingusrService;

    @Autowired
    ProMappingUsrConvert promappingusrConvert;

}
