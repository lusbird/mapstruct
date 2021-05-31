package org.mapstruct.example.conver;

import org.mapstruct.*;
import org.mapstruct.example.dto.PersonDTO;
import org.mapstruct.example.entity.Person;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    /**
     * @param personDTO
     */

    @Mapping(source = "dog.dheight", target = "dog.height")
    @Mapping(source = "dog.dhobby", target = "dog.hobby")
    public Person convertToPerson(PersonDTO personDTO);

    /**
     * 没有返回值，直接copy值
     * @param person
     */
    @Mapping(source = "dog.height", target = "dog.dheight")
    @Mapping(source = "dog.hobby", target = "dog.dhobby")
    @Mapping(source = "birth", target = "birth", dateFormat = "yyyy-MM-dd")
   public void convertToPersonDTO(Person person, @MappingTarget PersonDTO dto);

}