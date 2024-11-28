package com.akitsulab.api_kotlin_stub.domain

class Person(name: String, age: Int, skill: Skill) {
    val name: String
    val age: Int
    val skill: Skill

    init {
        this.name = name
        this.age = age
        this.skill = skill
    }

}