package com.lite.business.entity.magicianinfo;


import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
@TableName("magician_info")
public class MagicianInfo {

    private Integer range;

    private Integer power;

    private Integer gpid;

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }
    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
    public Integer getGpid() {
        return gpid;
    }

    public void setGpid(Integer gpid) {
        this.gpid = gpid;
    }

    @Override
    public String toString() {
        return "MagicianInfo{" +
            "range=" + range +
            ", power=" + power +
            ", gpid=" + gpid +
        "}";
    }
}
