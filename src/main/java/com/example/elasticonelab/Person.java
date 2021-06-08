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

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age  = age;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

}

