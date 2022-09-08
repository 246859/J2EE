package com.lite.business.convert.magicianinfo;


import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.lite.business.entity.magicianinfo.MagicianInfo;
import com.lite.business.dto.magicianinfo.MagicianInfoDTO;
import com.lite.business.vo.magicianinfo.MagicianInfoVO;

/**
* <p>
    * MagicianInfo 对象不同数据层转换器
    * </p>
*
* @author stranger
* @since 2022-09-07
*/

@Mapper(componentModel = "spring")
public interface MagicianInfoConvert {

    /**
     * VO 转换成 DTO
     */
    @Mappings({})
    MagicianInfoDTO voToDto(MagicianInfoVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<MagicianInfoDTO> voListToDtoList(List<MagicianInfoVO> voList);

    /**
     * VO 转换成 Entity
     */
    @Mappings({})
    MagicianInfo voToEntity(MagicianInfoVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<MagicianInfo> voListToEntityList(List<MagicianInfoVO> voList);

    /**
     * DTO 转换成 VO
     */
    @Mappings({})
    MagicianInfoVO dtoToVo(MagicianInfoDTO dto);

    /**
     * DTO列表 转换成 VO列表
     */
    @Mappings({})
    List<MagicianInfoVO> dtoListToVoList(List<MagicianInfoDTO> dtoList);

    /**
     * DTO 转换成 Entity
     */
    @Mappings({})
    MagicianInfo dtoToEntity(MagicianInfoDTO dto);

    /**
     * DTO列表 转换成 Entity列表
     */
    @Mappings({})
    List<MagicianInfo> dtoListToEntityList(List<MagicianInfoDTO> dtoList);

    /**
     * Entity 转换成 DTO
     */
    @Mappings({})
    MagicianInfoDTO entityToDto(MagicianInfo entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<MagicianInfoDTO> entityListToDtoList(List<MagicianInfo> entityList);

    /**
     * Entity 转换成 VO
     */
    @Mappings({})
    MagicianInfoVO entityToVO(MagicianInfo entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<MagicianInfoVO> entityListToVoList(List<MagicianInfo> entityList);


}
