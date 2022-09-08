package com.lite.business.convert.users;


import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.lite.business.entity.users.Users;
import com.lite.business.dto.users.UsersDTO;
import com.lite.business.vo.users.UsersVO;

/**
* <p>
    * Users 对象不同数据层转换器
    * </p>
*
* @author stranger
* @since 2022-09-07
*/

@Mapper(componentModel = "spring")
public interface UsersConvert {

    /**
     * VO 转换成 DTO
     */
    @Mappings({})
    UsersDTO voToDto(UsersVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<UsersDTO> voListToDtoList(List<UsersVO> voList);

    /**
     * VO 转换成 Entity
     */
    @Mappings({})
    Users voToEntity(UsersVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<Users> voListToEntityList(List<UsersVO> voList);

    /**
     * DTO 转换成 VO
     */
    @Mappings({})
    UsersVO dtoToVo(UsersDTO dto);

    /**
     * DTO列表 转换成 VO列表
     */
    @Mappings({})
    List<UsersVO> dtoListToVoList(List<UsersDTO> dtoList);

    /**
     * DTO 转换成 Entity
     */
    @Mappings({})
    Users dtoToEntity(UsersDTO dto);

    /**
     * DTO列表 转换成 Entity列表
     */
    @Mappings({})
    List<Users> dtoListToEntityList(List<UsersDTO> dtoList);

    /**
     * Entity 转换成 DTO
     */
    @Mappings({})
    UsersDTO entityToDto(Users entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<UsersDTO> entityListToDtoList(List<Users> entityList);

    /**
     * Entity 转换成 VO
     */
    @Mappings({})
    UsersVO entityToVO(Users entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<UsersVO> entityListToVoList(List<Users> entityList);


}
