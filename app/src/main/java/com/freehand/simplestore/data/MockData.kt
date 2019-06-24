package com.freehand.simplestore.data

import java.util.*

class MockData : IItem {
    private lateinit var url: String

    companion object {
        fun genData(count: Int): List<IItem> {
            var result = mutableListOf<IItem>()
            for (i in 0..count) {
                val temp = MockData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKzgyVcZSmiRxMn3SR1eZK4aMBlGHHMwK8RhZT1mzeOBAkQAhYlw")
                result.add(temp)
            }
            return result
        }

        fun genCategories(count: Int): List<IItem> {
            var result = mutableListOf<IItem>()
            for (i in 0..count) {
                val temp = MockData("http://mystateoffitness.com/wp-content/uploads/2015/12/healthy-meal.jpg")
                result.add(temp)
            }
            return result
        }
    }

    constructor(url: String) {
        this.url = url
    }

    override fun getUrl(): Any {
        return url
    }

    override fun getName(): CharSequence? {
        return UUID.randomUUID().toString() //To change body of created functions use File | Settings | File Templates.
    }
}