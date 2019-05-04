package com.ilazarev.kotlin.quickstart

class Person(val name: String, val isMarried: Boolean)

fun main(args: Array<String>) {
    val person = Person("Igor", true)
    println("Hello, ${person.name} !");
    println("${person.isMarried}");
}
