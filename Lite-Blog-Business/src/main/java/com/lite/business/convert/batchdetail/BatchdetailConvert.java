package com.lite.business.convert.batchdetail;


import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.lite.business.entity.batchdetail.Batchdetail;
import com.lite.business.dto.batchdetail.BatchdetailDTO;
import com.lite.business.vo.batchdetail.BatchdetailVO;

/**
* <p>
    * Batchdetail 对象不同数据层转换器
    * </p>
*
* @author stranger
* @since 2022-09-07
*/

@Mapper(componentModel = "spring")
public interface BatchdetailConvert {

    /**
     * VO 转换成 DTO
     */
    @Mappings({})
    BatchdetailDTO voToDto(BatchdetailVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<BatchdetailDTO> voListToDtoList(List<BatchdetailVO> voList);

    /**
     * VO 转换成 Entity
     */
    @Mappings({})
    Batchdetail voToEntity(BatchdetailVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<Batchdetail> voListToEntityList(List<BatchdetailVO> voList);

    /**
     * DTO 转换成 VO
     */
    @Mappings({})
    BatchdetailVO dtoToVo(BatchdetailDTO dto);

    /**
     * DTO列表 转换成 VO列表
     */
    @Mappings({})
    List<BatchdetailVO> dtoListToVoList(List<BatchdetailDTO> dtoList);

    /**
     * DTO 转换成 Entity
     */
    @Mappings({})
    Batchdetail dtoToEntity(BatchdetailDTO dto);

    /**
     * DTO列表 转换成 Entity列表
     */
    @Mappings({})
    List<Batchdetail> dtoListToEntityList(List<BatchdetailDTO> dtoList);

    /**
     * Entity 转换成 DTO
     */
    @Mappings({})
    BatchdetailDTO entityToDto(Batchdetail entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<BatchdetailDTO> entityListToDtoList(List<Batchdetail> entityList);

    /**
     * Entity 转换成 VO
     */
    @Mappings({})
    BatchdetailVO entityToVO(Batchdetail entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<BatchdetailVO> entityListToVoList(List<Batchdetail> entityList);


}
