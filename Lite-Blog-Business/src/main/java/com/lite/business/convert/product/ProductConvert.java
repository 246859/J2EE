package com.lite.business.convert.product;


import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.lite.business.entity.product.Product;
import com.lite.business.dto.product.ProductDTO;
import com.lite.business.vo.product.ProductVO;

/**
* <p>
    * Product 对象不同数据层转换器
    * </p>
*
* @author stranger
* @since 2022-09-07
*/

@Mapper(componentModel = "spring")
public interface ProductConvert {

    /**
     * VO 转换成 DTO
     */
    @Mappings({})
    ProductDTO voToDto(ProductVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<ProductDTO> voListToDtoList(List<ProductVO> voList);

    /**
     * VO 转换成 Entity
     */
    @Mappings({})
    Product voToEntity(ProductVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<Product> voListToEntityList(List<ProductVO> voList);

    /**
     * DTO 转换成 VO
     */
    @Mappings({})
    ProductVO dtoToVo(ProductDTO dto);

    /**
     * DTO列表 转换成 VO列表
     */
    @Mappings({})
    List<ProductVO> dtoListToVoList(List<ProductDTO> dtoList);

    /**
     * DTO 转换成 Entity
     */
    @Mappings({})
    Product dtoToEntity(ProductDTO dto);

    /**
     * DTO列表 转换成 Entity列表
     */
    @Mappings({})
    List<Product> dtoListToEntityList(List<ProductDTO> dtoList);

    /**
     * Entity 转换成 DTO
     */
    @Mappings({})
    ProductDTO entityToDto(Product entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<ProductDTO> entityListToDtoList(List<Product> entityList);

    /**
     * Entity 转换成 VO
     */
    @Mappings({})
    ProductVO entityToVO(Product entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<ProductVO> entityListToVoList(List<Product> entityList);


}
