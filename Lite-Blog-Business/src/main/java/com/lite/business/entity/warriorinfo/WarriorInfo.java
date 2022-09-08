package com.lite.business.entity.warriorinfo;


import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
@TableName("warrior_info")
public class WarriorInfo {

    private Integer svalue;

    private Integer power;

    private Integer gpid;

    public Integer getSvalue() {
        return svalue;
    }

    public void setSvalue(Integer svalue) {
        this.svalue = svalue;
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
        return "WarriorInfo{" +
            "svalue=" + svalue +
            ", power=" + power +
            ", gpid=" + gpid +
        "}";
    }
}
