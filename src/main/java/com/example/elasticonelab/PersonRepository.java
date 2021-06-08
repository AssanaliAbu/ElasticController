package com.example.elasticonelab;

import org.springframework.data.domain.Page;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface PersonRepository extends ElasticsearchRepository<Person, String> {
    @Query("{\"bool\" : {\"must\" : {\"range\" : {\"age\" : {\"from\" : \"?0\",\"to\" :null,\"include_lower\" : true,\"include_upper\" : true}}}}}")
    List<Person> findOlderThan(int from);

    @Query("{\"bool\" : {\"must\" : {\"match\" : {\"name\" : \"?0\"}}}}")
    List<Person> findByName(String name);

    @Query("{\"bool\" : {\"must\" : {\"match\" : {\"age\" : \"?0\"}}}}")
    List<Person> findByAge(int age);






}