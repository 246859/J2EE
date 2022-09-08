package com.lite.business.dto.customer;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
/**
 * <p>
 * CustomerDTO 传输层对象
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
public class CustomerDTO {


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

    /**
     * 更新版本
     */
    private Integer version;
    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    private LocalDateTime updatedTime;
}
