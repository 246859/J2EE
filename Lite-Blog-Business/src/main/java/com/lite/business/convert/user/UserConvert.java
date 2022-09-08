package com.lite.business.convert.user;


import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.lite.business.entity.user.User;
import com.lite.business.dto.user.UserDTO;
import com.lite.business.vo.user.UserVO;

/**
* <p>
    * User 对象不同数据层转换器
    * </p>
*
* @author stranger
* @since 2022-09-07
*/

@Mapper(componentModel = "spring")
public interface UserConvert {

    /**
     * VO 转换成 DTO
     */
    @Mappings({})
    UserDTO voToDto(UserVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<UserDTO> voListToDtoList(List<UserVO> voList);

    /**
     * VO 转换成 Entity
     */
    @Mappings({})
    User voToEntity(UserVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<User> voListToEntityList(List<UserVO> voList);

    /**
     * DTO 转换成 VO
     */
    @Mappings({})
    UserVO dtoToVo(UserDTO dto);

    /**
     * DTO列表 转换成 VO列表
     */
    @Mappings({})
    List<UserVO> dtoListToVoList(List<UserDTO> dtoList);

    /**
     * DTO 转换成 Entity
     */
    @Mappings({})
    User dtoToEntity(UserDTO dto);

    /**
     * DTO列表 转换成 Entity列表
     */
    @Mappings({})
    List<User> dtoListToEntityList(List<UserDTO> dtoList);

    /**
     * Entity 转换成 DTO
     */
    @Mappings({})
    UserDTO entityToDto(User entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<UserDTO> entityListToDtoList(List<User> entityList);

    /**
     * Entity 转换成 VO
     */
    @Mappings({})
    UserVO entityToVO(User entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<UserVO> entityListToVoList(List<User> entityList);


}
