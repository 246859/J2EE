package com.lite.business.controller.batch;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
    import com.lite.business.convert.batch.BatchConvert;
import com.lite.business.service.batch.BatchService;

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
@RequestMapping("/batch")
public class BatchController {
    @Autowired
    BatchService batchService;

    @Autowired
    BatchConvert batchConvert;

}
