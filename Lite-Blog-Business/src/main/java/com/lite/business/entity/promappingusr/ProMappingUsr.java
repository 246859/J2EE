package com.lite.business.entity.promappingusr;


import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
@TableName("pro_mapping_usr")
public class ProMappingUsr {

    private Integer pid;

    private Integer uid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "ProMappingUsr{" +
            "pid=" + pid +
            ", uid=" + uid +
        "}";
    }
}
