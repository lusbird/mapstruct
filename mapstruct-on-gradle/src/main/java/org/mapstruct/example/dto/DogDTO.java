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

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DogDTO {

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
    private int dheight;

    /**
     * 爱好
     */
    private String dhobby;
}
