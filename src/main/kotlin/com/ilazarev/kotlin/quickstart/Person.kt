package com.ilazarev.kotlin.quickstart

class Person(val name: String, val married: Boolean)

fun main(args: Array<String>) {
    show(Person("Igor", true))
    show(Person("John", false))
}

private fun show(person: Person) {
    print("Hello, ${person.name}! ");
    var word = "";
    if (!person.married) {
        word = "not "
    }
    println("You are " + word + "married.");
}
