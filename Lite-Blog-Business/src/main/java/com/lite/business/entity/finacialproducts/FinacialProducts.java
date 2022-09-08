package com.lite.business.entity.finacialproducts;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
@TableName("finacial_products")
public class FinacialProducts {

    @TableId(value = "product_id", type = IdType.AUTO)
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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
    public LocalDateTime getInvasttime() {
        return invasttime;
    }

    public void setInvasttime(LocalDateTime invasttime) {
        this.invasttime = invasttime;
    }

    @Override
    public String toString() {
        return "FinacialProducts{" +
            "productId=" + productId +
            ", name=" + name +
            ", price=" + price +
            ", detail=" + detail +
            ", pic=" + pic +
            ", invasttime=" + invasttime +
        "}";
    }
}
