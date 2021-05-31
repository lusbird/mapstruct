/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mapstruct.example.entity.Car;
import org.mapstruct.example.entity.Cat;
import org.mapstruct.example.entity.Dog;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {

    /**
     * 昵称
     */
   private String name;

    /**
     * 性别
     */
    private String sex;

    private String birth;

    private DogDTO dog;

    private CatDTO cat;

    private List<Car> cars;

    private Map<String, List> other;

}
