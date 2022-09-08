package com.lite.business.dto.gameplayer;

import java.time.LocalDateTime;
/**
 * <p>
 * GameplayerDTO 传输层对象
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
public class GameplayerDTO {


    private Integer id;
    private String name;
    private String gender;
    private Integer level;
    private Integer ptype;

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
