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
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dog {

    /**
     * 昵称
     */
   private String nickName;

    /**
     * 体重
     */
   private float weight;

    /**
     * 年龄
     */
   private int age;

    /**
     * 性别
     */
    private int sex;

    /**
     * 身高
     */
    private int height;

    /**
     * 爱好
     */
    private String hobby;

}
