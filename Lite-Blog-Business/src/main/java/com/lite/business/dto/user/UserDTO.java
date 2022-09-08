package com.lite.business.dto.user;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDate;
/**
 * <p>
 * UserDTO 传输层对象
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
public class UserDTO {


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
    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    private LocalDateTime updatedTime;
}
