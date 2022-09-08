package com.lite.business.dto.magicianinfo;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * <p>
 * MagicianInfoDTO 传输层对象
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
public class MagicianInfoDTO {


    private Integer range;
    private Integer power;
    private Integer gpid;

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
