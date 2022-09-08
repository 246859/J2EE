package com.lite.business.entity.product;


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
public class Product {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String productName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
            "id=" + id +
            ", productName=" + productName +
        "}";
    }
}
