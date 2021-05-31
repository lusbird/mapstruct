/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.example;

import lombok.extern.java.Log;
import org.mapstruct.example.conver.ConverMapper;
import org.mapstruct.example.dto.CatDTO;
import org.mapstruct.example.entity.Animal;
import org.mapstruct.example.entity.Cat;
import org.mapstruct.example.entity.Dog;
import org.testng.annotations.Test;
import static org.fest.assertions.Assertions.assertThat;

@Log
public class ConversionTest {

    @Test
    public void factoryApplyConversions() {

        Dog dog = new Dog();
        dog.setAge(111);
        dog.setSex(0);
        dog.setWeight(24.39f);

        Animal animal = ConverMapper.INSTANCE.converToAnimal(dog);

        assertThat(animal).isNotNull();

        assertThat(animal.getWeight()).isEqualTo("24.39");
    }

    @Test
    public void ApplyConversions() {

        Cat cat = new Cat();
        cat.setName("hu hu");

        CatDTO catDTO = ConverMapper.INSTANCE.convertToCat(cat);
        assertThat(catDTO.getAge()).isEqualTo(111);
    }
}
