package com.lite.business.vo.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDate;
/**
* <p>
    * UserVO 视图层对象
    * </p>
*
* @author stranger
* @since 2022-09-07
*/
public class UserVO {


    private Integer id;
    private String username;
    private String password;
    private String gender;
    private String email;
    private String province;
    private String city;
    private LocalDate birthday;
    /**
     * 更新版本
     */
    private Integer version;
}
