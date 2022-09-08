package com.lite.business.vo.finacialproducts;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
/**
* <p>
    * FinacialProductsVO 视图层对象
    * </p>
*
* @author stranger
* @since 2022-09-07
*/
public class FinacialProductsVO {


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
}
