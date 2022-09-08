package com.lite.business.vo.customer;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
/**
* <p>
    * CustomerVO 视图层对象
    * </p>
*
* @author stranger
* @since 2022-09-07
*/
public class CustomerVO {


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
}
