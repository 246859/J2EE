package com.lite.business.convert.gameplayer;


import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.lite.business.entity.gameplayer.Gameplayer;
import com.lite.business.dto.gameplayer.GameplayerDTO;
import com.lite.business.vo.gameplayer.GameplayerVO;

/**
* <p>
    * Gameplayer 对象不同数据层转换器
    * </p>
*
* @author stranger
* @since 2022-09-07
*/

@Mapper(componentModel = "spring")
public interface GameplayerConvert {

    /**
     * VO 转换成 DTO
     */
    @Mappings({})
    GameplayerDTO voToDto(GameplayerVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<GameplayerDTO> voListToDtoList(List<GameplayerVO> voList);

    /**
     * VO 转换成 Entity
     */
    @Mappings({})
    Gameplayer voToEntity(GameplayerVO vo);

    /**
     * VO列表 转换成 DTO列表
     */
    @Mappings({})
    List<Gameplayer> voListToEntityList(List<GameplayerVO> voList);

    /**
     * DTO 转换成 VO
     */
    @Mappings({})
    GameplayerVO dtoToVo(GameplayerDTO dto);

    /**
     * DTO列表 转换成 VO列表
     */
    @Mappings({})
    List<GameplayerVO> dtoListToVoList(List<GameplayerDTO> dtoList);

    /**
     * DTO 转换成 Entity
     */
    @Mappings({})
    Gameplayer dtoToEntity(GameplayerDTO dto);

    /**
     * DTO列表 转换成 Entity列表
     */
    @Mappings({})
    List<Gameplayer> dtoListToEntityList(List<GameplayerDTO> dtoList);

    /**
     * Entity 转换成 DTO
     */
    @Mappings({})
    GameplayerDTO entityToDto(Gameplayer entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<GameplayerDTO> entityListToDtoList(List<Gameplayer> entityList);

    /**
     * Entity 转换成 VO
     */
    @Mappings({})
    GameplayerVO entityToVO(Gameplayer entity);

    /**
     * Entity列表 转换成 DTO列表
     */
    @Mappings({})
    List<GameplayerVO> entityListToVoList(List<Gameplayer> entityList);


}
