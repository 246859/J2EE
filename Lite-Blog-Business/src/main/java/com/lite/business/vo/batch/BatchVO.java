package com.lite.business.vo.batch;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
/**
* <p>
    * BatchVO 视图层对象
    * </p>
*
* @author stranger
* @since 2022-09-07
*/
public class BatchVO {


    private Integer batchId;
    /**
     * 创建批次用户id
     */
    private Integer cusId;
    /**
     * 批次编码
     */
    private String number;
    /**
     * 创建批次时间
     */
    private LocalDateTime createtime;
    /**
     * 备注
     */
    private String note;
    /**
     * 更新版本
     */
    private Integer version;
}
