package com.lite.business.dto.promappingusr;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * <p>
 * ProMappingUsrDTO 传输层对象
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
public class ProMappingUsrDTO {


    private Integer pid;
    private Integer uid;

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
