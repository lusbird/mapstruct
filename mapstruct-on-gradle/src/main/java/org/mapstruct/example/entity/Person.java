/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    /**
     * 昵称
     */
   private String name;

    /**
     * 性别
     */
    private int sex;

    private LocalDate birth;

    private Dog dog;

    private Cat cat;

    private List<Car> cars;

    private Map<String, List> other;
}
