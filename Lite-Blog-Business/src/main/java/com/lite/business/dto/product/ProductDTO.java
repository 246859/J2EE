package com.lite.business.dto.product;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
/**
 * <p>
 * ProductDTO 传输层对象
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
public class ProductDTO {


    private Integer id;
    private String productName;

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
