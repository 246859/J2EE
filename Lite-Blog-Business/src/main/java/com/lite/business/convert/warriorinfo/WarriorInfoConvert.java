package com.lite.business.convert.warriorinfo;


import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.lite.business.entity.warriorinfo.WarriorInfo;
import com.lite.business.dto.warriorinfo.WarriorInfoDTO;
import com.lite.business.vo.warriorinfo.WarriorInfoVO;

/**
* <p>
    * WarriorInfo 对象不同数据层转换器
    * </p>
*
* @author stranger
* @since 2022-09-07
*/

@Mapper(componentModel = "spring")
public interface WarriorInfoConvert {

    /**
     * VO 转换成 DTO
     */
    @Mappings({})
    WarriorInfoDTO voToDto(WarriorInfoVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<WarriorInfoDTO> voListToDtoList(List<WarriorInfoVO> voList);

    /**
     * VO 转换成 Entity
     */
    @Mappings({})
    WarriorInfo voToEntity(WarriorInfoVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<WarriorInfo> voListToEntityList(List<WarriorInfoVO> voList);

    /**
     * DTO 转换成 VO
     */
    @Mappings({})
    WarriorInfoVO dtoToVo(WarriorInfoDTO dto);

    /**
     * DTO列表 转换成 VO列表
     */
    @Mappings({})
    List<WarriorInfoVO> dtoListToVoList(List<WarriorInfoDTO> dtoList);

    /**
     * DTO 转换成 Entity
     */
    @Mappings({})
    WarriorInfo dtoToEntity(WarriorInfoDTO dto);

    /**
     * DTO列表 转换成 Entity列表
     */
    @Mappings({})
    List<WarriorInfo> dtoListToEntityList(List<WarriorInfoDTO> dtoList);

    /**
     * Entity 转换成 DTO
     */
    @Mappings({})
    WarriorInfoDTO entityToDto(WarriorInfo entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<WarriorInfoDTO> entityListToDtoList(List<WarriorInfo> entityList);

    /**
     * Entity 转换成 VO
     */
    @Mappings({})
    WarriorInfoVO entityToVO(WarriorInfo entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<WarriorInfoVO> entityListToVoList(List<WarriorInfo> entityList);


}
