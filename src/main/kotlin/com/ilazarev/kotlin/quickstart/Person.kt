package com.ilazarev.kotlin.quickstart

//class Person(val name: String, val married: Boolean)
class Person {
    var name: String = ""
    var age: Int = 28
    var married: Boolean = false

    constructor(name: String, age: Int, married: Boolean) {
        this.name = name
        this.age = age
        this.married = married
    }

    fun olderThan(anotherPerson: Person): Boolean {
        return this.age > anotherPerson.age
    }
}

fun main(args: Array<String>) {
    show(Person("Igor", 51, true))
    show(Person("John", 40, false))
}

private fun show(person: Person) {
    print("Hello, ${person.name}! ");
    var word = "";
    if (!person.married) {
        word = "not "
    }
    println("You are " + word + "married.");
}
