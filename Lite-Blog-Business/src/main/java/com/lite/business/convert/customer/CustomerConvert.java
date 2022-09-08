package com.lite.business.convert.customer;


import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.lite.business.entity.customer.Customer;
import com.lite.business.dto.customer.CustomerDTO;
import com.lite.business.vo.customer.CustomerVO;

/**
* <p>
    * Customer 对象不同数据层转换器
    * </p>
*
* @author stranger
* @since 2022-09-07
*/

@Mapper(componentModel = "spring")
public interface CustomerConvert {

    /**
     * VO 转换成 DTO
     */
    @Mappings({})
    CustomerDTO voToDto(CustomerVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<CustomerDTO> voListToDtoList(List<CustomerVO> voList);

    /**
     * VO 转换成 Entity
     */
    @Mappings({})
    Customer voToEntity(CustomerVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<Customer> voListToEntityList(List<CustomerVO> voList);

    /**
     * DTO 转换成 VO
     */
    @Mappings({})
    CustomerVO dtoToVo(CustomerDTO dto);

    /**
     * DTO列表 转换成 VO列表
     */
    @Mappings({})
    List<CustomerVO> dtoListToVoList(List<CustomerDTO> dtoList);

    /**
     * DTO 转换成 Entity
     */
    @Mappings({})
    Customer dtoToEntity(CustomerDTO dto);

    /**
     * DTO列表 转换成 Entity列表
     */
    @Mappings({})
    List<Customer> dtoListToEntityList(List<CustomerDTO> dtoList);

    /**
     * Entity 转换成 DTO
     */
    @Mappings({})
    CustomerDTO entityToDto(Customer entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<CustomerDTO> entityListToDtoList(List<Customer> entityList);

    /**
     * Entity 转换成 VO
     */
    @Mappings({})
    CustomerVO entityToVO(Customer entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<CustomerVO> entityListToVoList(List<Customer> entityList);


}
