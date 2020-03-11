package com.example.recyclerview.model

import android.provider.ContactsContract

data class Person(
    val name: String,
    val email: String
)

class PersonBuilder {
    var name:String = ""
    var email: String = ""

    fun build(): Person = Person(name, email)
}

fun person(block: PersonBuilder.() -> Unit): Person = PersonBuilder().apply(block).build()

fun fakePersons() = mutableListOf(
    person {
        name = "Victor Luca"
        email = "vluca002@gmail.com"
    },person {
        name = "Mateus Antonio"
        email = "matant@gmail.com"
    },person {
        name = "Sara Oliveira"
        email = "sarinha123@gmail.com"
    },person {
        name = "Lucas Breto"
        email = "bichopiruleta321@gmail.com"
    },person {
        name = "Felipe Lima"
        email = "mortalkombt@gmail.com"
    },person {
        name = "José Fransisco"
        email = "fj.aquino@gmail.com"
    },person {
        name = "Mateus Soares"
        email = "mateusdelas@gmail.com"
    },person {
        name = "Random Person Name"
        email = "randemail@gmail.com"
    },person {
        name = "Não sei"
        email = "whatever@gmail.com"
    }
)