package com.lite.business.convert.batch;


import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.lite.business.entity.batch.Batch;
import com.lite.business.dto.batch.BatchDTO;
import com.lite.business.vo.batch.BatchVO;

/**
* <p>
    * Batch 对象不同数据层转换器
    * </p>
*
* @author stranger
* @since 2022-09-07
*/

@Mapper(componentModel = "spring")
public interface BatchConvert {

    /**
     * VO 转换成 DTO
     */
    @Mappings({})
    BatchDTO voToDto(BatchVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<BatchDTO> voListToDtoList(List<BatchVO> voList);

    /**
     * VO 转换成 Entity
     */
    @Mappings({})
    Batch voToEntity(BatchVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<Batch> voListToEntityList(List<BatchVO> voList);

    /**
     * DTO 转换成 VO
     */
    @Mappings({})
    BatchVO dtoToVo(BatchDTO dto);

    /**
     * DTO列表 转换成 VO列表
     */
    @Mappings({})
    List<BatchVO> dtoListToVoList(List<BatchDTO> dtoList);

    /**
     * DTO 转换成 Entity
     */
    @Mappings({})
    Batch dtoToEntity(BatchDTO dto);

    /**
     * DTO列表 转换成 Entity列表
     */
    @Mappings({})
    List<Batch> dtoListToEntityList(List<BatchDTO> dtoList);

    /**
     * Entity 转换成 DTO
     */
    @Mappings({})
    BatchDTO entityToDto(Batch entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<BatchDTO> entityListToDtoList(List<Batch> entityList);

    /**
     * Entity 转换成 VO
     */
    @Mappings({})
    BatchVO entityToVO(Batch entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<BatchVO> entityListToVoList(List<Batch> entityList);


}
