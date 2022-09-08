package com.lite.business.dto.batchdetail;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
/**
 * <p>
 * BatchdetailDTO 传输层对象
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
public class BatchdetailDTO {


    private Integer id;
            /**
            * 批次id
            */
    private Integer batchId;
            /**
            * 理财产品id
            */
    private Integer productId;
            /**
            * 理财产品购买数量
            */
    private Integer productNum;

    /**
     * 更新版本
     */
    private Integer version;
    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    private LocalDateTime updatedTime;
}
