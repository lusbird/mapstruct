package org.mapstruct.example.conver;

import org.mapstruct.Mapper;
import org.mapstruct.example.dto.CatDTO;
import org.mapstruct.example.entity.Cat;

@Mapper(uses= DateUtils.class)
public interface CatMapper {

    /**
     * 日期类型转换为字符串
     * @param catDTO
     * @return
     */
    Cat convertToCat(CatDTO catDTO);


    CatDTO convertToCatDTO(Cat cat);

}