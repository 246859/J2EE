package com.lite.business.convert.promappingusr;


import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.lite.business.entity.promappingusr.ProMappingUsr;
import com.lite.business.dto.promappingusr.ProMappingUsrDTO;
import com.lite.business.vo.promappingusr.ProMappingUsrVO;

/**
* <p>
    * ProMappingUsr 对象不同数据层转换器
    * </p>
*
* @author stranger
* @since 2022-09-07
*/

@Mapper(componentModel = "spring")
public interface ProMappingUsrConvert {

    /**
     * VO 转换成 DTO
     */
    @Mappings({})
    ProMappingUsrDTO voToDto(ProMappingUsrVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<ProMappingUsrDTO> voListToDtoList(List<ProMappingUsrVO> voList);

    /**
     * VO 转换成 Entity
     */
    @Mappings({})
    ProMappingUsr voToEntity(ProMappingUsrVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<ProMappingUsr> voListToEntityList(List<ProMappingUsrVO> voList);

    /**
     * DTO 转换成 VO
     */
    @Mappings({})
    ProMappingUsrVO dtoToVo(ProMappingUsrDTO dto);

    /**
     * DTO列表 转换成 VO列表
     */
    @Mappings({})
    List<ProMappingUsrVO> dtoListToVoList(List<ProMappingUsrDTO> dtoList);

    /**
     * DTO 转换成 Entity
     */
    @Mappings({})
    ProMappingUsr dtoToEntity(ProMappingUsrDTO dto);

    /**
     * DTO列表 转换成 Entity列表
     */
    @Mappings({})
    List<ProMappingUsr> dtoListToEntityList(List<ProMappingUsrDTO> dtoList);

    /**
     * Entity 转换成 DTO
     */
    @Mappings({})
    ProMappingUsrDTO entityToDto(ProMappingUsr entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<ProMappingUsrDTO> entityListToDtoList(List<ProMappingUsr> entityList);

    /**
     * Entity 转换成 VO
     */
    @Mappings({})
    ProMappingUsrVO entityToVO(ProMappingUsr entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<ProMappingUsrVO> entityListToVoList(List<ProMappingUsr> entityList);


}
