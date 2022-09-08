package com.lite.business.controller.batchdetail;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
    import com.lite.business.convert.batchdetail.BatchdetailConvert;
import com.lite.business.service.batchdetail.BatchdetailService;

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
@RequestMapping("/batchdetail")
public class BatchdetailController {
    @Autowired
    BatchdetailService batchdetailService;

    @Autowired
    BatchdetailConvert batchdetailConvert;

}
