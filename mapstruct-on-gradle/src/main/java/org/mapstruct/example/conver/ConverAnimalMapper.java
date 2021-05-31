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
public abstract class ConverAnimalMapper {

    ConverAnimalMapper INSTANCE = Mappers.getMapper(ConverAnimalMapper.class);

    /**
     * 直接传递
     * @param dog
     * @return
     */
    @Mapping(source = "dog.nickName", target = "name", defaultValue = "d01")
    @Mapping(source = "xingbie", target = "sex")
    abstract Animal converToAnimal(Dog dog, int xingbie);



}
