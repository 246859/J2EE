package com.lite.business.entity.batchdetail;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * <p>
 * 
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
public class Batchdetail {

    @TableId(value = "id", type = IdType.AUTO)
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    @Override
    public String toString() {
        return "Batchdetail{" +
            "id=" + id +
            ", batchId=" + batchId +
            ", productId=" + productId +
            ", productNum=" + productNum +
        "}";
    }
}
