package com.lite.business.vo.product;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
/**
* <p>
    * ProductVO 视图层对象
    * </p>
*
* @author stranger
* @since 2022-09-07
*/
public class ProductVO {


    private Integer id;
    private String productName;
    /**
     * 更新版本
     */
    private Integer version;
}
