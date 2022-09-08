package com.lite.business.entity.users;


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
public class Users {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String gender;

    private String email;

    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Users{" +
            "id=" + id +
            ", username=" + username +
            ", gender=" + gender +
            ", email=" + email +
            ", pid=" + pid +
        "}";
    }
}
