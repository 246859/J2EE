package com.lite.business.vo.users;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
/**
* <p>
    * UsersVO 视图层对象
    * </p>
*
* @author stranger
* @since 2022-09-07
*/
public class UsersVO {


    private Integer id;
    private String username;
    private String gender;
    private String email;
    private Integer pid;
    /**
     * 更新版本
     */
    private Integer version;
}
