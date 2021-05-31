/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.example.dto;

import lombok.Data;

@Data
public class AnimalDTO {

    /**
     * 昵称
     */
   private String name;

    /**
     * 性别
     */
    private int sex;
}
