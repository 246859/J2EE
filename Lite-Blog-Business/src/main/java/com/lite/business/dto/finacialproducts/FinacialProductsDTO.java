package com.lite.business.dto.finacialproducts;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
/**
 * <p>
 * FinacialProductsDTO 传输层对象
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
public class FinacialProductsDTO {


    private Integer productId;
            /**
            * 理财产品名称
            */
    private String name;
            /**
            * 理财产品定价
            */
    private Float price;
            /**
            * 理财产品描述
            */
    private String detail;
            /**
            * 理财产品图片
            */
    private String pic;
            /**
            * 理财产品收益日期
            */
    private LocalDateTime invasttime;

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
