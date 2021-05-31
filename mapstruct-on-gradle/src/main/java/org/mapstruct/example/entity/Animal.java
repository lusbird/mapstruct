/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.example.entity;

import lombok.Data;

@Data
public class Animal {

    /**
     * 昵称
     */
   private String name;

    /**
     * 性别
     */
    private int sex;

    /**
     * 体重
     */
    private String weight;

}
