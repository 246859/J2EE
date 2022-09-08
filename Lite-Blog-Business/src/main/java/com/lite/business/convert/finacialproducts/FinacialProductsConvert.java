package com.lite.business.convert.finacialproducts;


import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.lite.business.entity.finacialproducts.FinacialProducts;
import com.lite.business.dto.finacialproducts.FinacialProductsDTO;
import com.lite.business.vo.finacialproducts.FinacialProductsVO;

/**
* <p>
    * FinacialProducts 对象不同数据层转换器
    * </p>
*
* @author stranger
* @since 2022-09-07
*/

@Mapper(componentModel = "spring")
public interface FinacialProductsConvert {

    /**
     * VO 转换成 DTO
     */
    @Mappings({})
    FinacialProductsDTO voToDto(FinacialProductsVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<FinacialProductsDTO> voListToDtoList(List<FinacialProductsVO> voList);

    /**
     * VO 转换成 Entity
     */
    @Mappings({})
    FinacialProducts voToEntity(FinacialProductsVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<FinacialProducts> voListToEntityList(List<FinacialProductsVO> voList);

    /**
     * DTO 转换成 VO
     */
    @Mappings({})
    FinacialProductsVO dtoToVo(FinacialProductsDTO dto);

    /**
     * DTO列表 转换成 VO列表
     */
    @Mappings({})
    List<FinacialProductsVO> dtoListToVoList(List<FinacialProductsDTO> dtoList);

    /**
     * DTO 转换成 Entity
     */
    @Mappings({})
    FinacialProducts dtoToEntity(FinacialProductsDTO dto);

    /**
     * DTO列表 转换成 Entity列表
     */
    @Mappings({})
    List<FinacialProducts> dtoListToEntityList(List<FinacialProductsDTO> dtoList);

    /**
     * Entity 转换成 DTO
     */
    @Mappings({})
    FinacialProductsDTO entityToDto(FinacialProducts entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<FinacialProductsDTO> entityListToDtoList(List<FinacialProducts> entityList);

    /**
     * Entity 转换成 VO
     */
    @Mappings({})
    FinacialProductsVO entityToVO(FinacialProducts entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<FinacialProductsVO> entityListToVoList(List<FinacialProducts> entityList);


}
