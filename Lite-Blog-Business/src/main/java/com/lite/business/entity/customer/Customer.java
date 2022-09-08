package com.lite.business.entity.customer;


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
public class Customer {

    @TableId(value = "cus_id", type = IdType.AUTO)
    private Integer cusId;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 卡号
     */
    private String acno;

    /**
     * 性别
     */
    private String gender;

    /**
     * 电话
     */
    private String phone;

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
            "cusId=" + cusId +
            ", username=" + username +
            ", acno=" + acno +
            ", gender=" + gender +
            ", phone=" + phone +
        "}";
    }
}
