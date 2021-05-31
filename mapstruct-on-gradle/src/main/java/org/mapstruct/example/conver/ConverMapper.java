/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.example.conver;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.example.dto.CatDTO;
import org.mapstruct.example.dto.DogDTO;
import org.mapstruct.example.entity.Animal;
import org.mapstruct.example.entity.Cat;
import org.mapstruct.example.entity.Dog;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConverMapper {

    ConverMapper INSTANCE = Mappers.getMapper(ConverMapper.class);

    /**
     * 字段相同的转换
     * @param cat
     * @return
     */

    CatDTO convertToCat(Cat cat);

    /**
     * 字段不同的转换
     * @param dog
     * @return
     */
    @Mapping(source = "nickName", target = "name", ignore = true,  defaultValue = "dog001")
    @Mapping(source = "weight",target = "weight", numberFormat = "#.##")
    Animal converToAnimal(Dog dog);


    /**
     * 多字段不同的转换
     * @param dogDTO
     * @return
     */
    @Mapping(source = "dheight", target = "height")
    @Mapping(source = "dhobby", target = "hobby")
    Dog converToDog(DogDTO dogDTO);

    /**
     * target中字段在source中找不到，默认在编译期间会报告编译警告，可以设置编译级别忽略该警告
     * @param catDTO
     * @return
     */
    @Mapping(target = "nickName", ignore = true)
    @Mapping(target = "dheight", ignore = true)
    @Mapping(target = "dhobby", ignore = true)
    DogDTO catConverToDog(CatDTO catDTO);
}
