package com.example.elasticonelab;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Document(indexName = "mylord")
public class Person {
    @Id
    private String id;
    private String name;
    private int age;
    private String position;
    private int salary;

    public Person(){

    }

    public Person(String name, int age, String position, int salary){
        this.name = name;
        this.age  = age;
        this.position = position;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

}

