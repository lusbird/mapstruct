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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cat {

    /**
     * 昵称
     */
   private String name;

    /**
     * 体重
     */
   private int weight;

    /**
     * 年龄
     */
   private int age;

    /**
     * 性别
     */
    private int sex;


    private String birth;
}
