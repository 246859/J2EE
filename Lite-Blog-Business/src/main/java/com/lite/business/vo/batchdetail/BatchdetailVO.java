package com.lite.business.vo.batchdetail;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
/**
* <p>
    * BatchdetailVO 视图层对象
    * </p>
*
* @author stranger
* @since 2022-09-07
*/
public class BatchdetailVO {


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
}
