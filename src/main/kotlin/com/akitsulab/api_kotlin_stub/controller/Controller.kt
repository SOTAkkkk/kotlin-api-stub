package com.akitsulab.api_kotlin_stub.controller;

import com.akitsulab.api_kotlin_stub.domain.Person
import com.akitsulab.api_kotlin_stub.domain.Skill
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {

    @GetMapping("/")
    fun getPerson(): Person {
        val skill = Skill("java", 3)
        val person = Person("sota", 27, skill)
        return person
    }

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello"
    }

}
