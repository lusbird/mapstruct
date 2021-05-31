/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.example;

import org.mapstruct.example.conver.PersonMapper;
import org.mapstruct.example.dto.DogDTO;
import org.mapstruct.example.dto.PersonDTO;
import org.mapstruct.example.entity.*;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.fest.assertions.Assertions.assertThat;

public class PersonConversionTest {

    @Test
    public void convertToPerson() {

        PersonDTO dto = PersonDTO.builder()
                .name("xiao ming")
                .sex("0")
                .dog(DogDTO.builder()
                        .nickName("xiao hua")
                        .age(12)
                        .weight(29).build())
                .cars(Arrays.asList(Car.builder().code(3425632).build(), Car.builder().code(4363476).build()))
                .build();
        Person p = PersonMapper.INSTANCE.convertToPerson(dto);

        assertThat(p).isNotNull();
        assertThat(p.getCars().size()).isEqualTo(2);
        assertThat(p.getDog().getNickName()).isEqualTo("xiao hua");
    }

    @Test
    public void convertToPersonDTO() {

        Person person = Person.builder()
                .name("xiao ming")
                .sex(0)
                .dog(Dog.builder()
                        .nickName("xiao hua")
                        .age(12)
                        .weight(29).build())
                .cars(Arrays.asList(Car.builder().code(3425632).build(), Car.builder().code(4363476).build()))
                .build();

        PersonDTO dto = PersonDTO.builder().build();

        PersonMapper.INSTANCE.convertToPersonDTO(person, dto);

        assertThat(dto).isNotNull();
        assertThat(dto.getCars().size()).isEqualTo(2);
        assertThat(dto.getDog().getNickName()).isEqualTo("xiao hua");
    }
}
