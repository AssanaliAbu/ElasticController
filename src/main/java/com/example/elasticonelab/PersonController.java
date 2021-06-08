package com.example.elasticonelab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;


@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Person save(@RequestParam("name") String name, @RequestParam("age") int age){
        Person newPerson =  new Person(name, age);
        newPerson = personRepository.save(newPerson);
        return newPerson;
    }

    @RequestMapping(value = "/findbyname", method = RequestMethod.GET)
    public List<Person> findbyname(@RequestParam("name") String name){
        return personRepository.findByName(name);

    }


    @RequestMapping(value = "/findolderthan", method = RequestMethod.GET)
    public List<Person> findOlder(@RequestParam("from") int from){
        return personRepository.findOlderThan(from);

    }

    @RequestMapping(value = "/findbyage", method = RequestMethod.GET)
    public List<Person> findbyAge(@RequestParam("age") int age){
        return personRepository.findByAge(age);

    }

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public Page<Person> findall(){
        return (Page<Person>) personRepository.findAll();
    }


}
