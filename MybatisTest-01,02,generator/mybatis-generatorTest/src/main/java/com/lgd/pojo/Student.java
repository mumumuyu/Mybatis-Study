package com.lgd.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String id;

    private String name;

    private String sex;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}