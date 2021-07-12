package com.example.daggerissue

import org.junit.Test

class TestExample {

    @Test
    fun example() {
        val container = Container()
        val compA = DaggerComponentA.builder().build()
        compA.inject(container)

        container.example.doSomething()
    }

}