package com.freehand.simplestore.data

import java.util.*

class MockData : IItem {
    companion object {
        fun genData(count : Int):List<IItem> {
            var result = mutableListOf<IItem>()
            for (i in 0..count){
                val temp = MockData()
                result.add(temp)
            }
            return result
        }
    }
    override fun getUrl(): Any {
        return "https://www.heynutritionlady.com/wp-content/uploads/2018/01/winter_vegetable_meal_prep_bowls_3-500x453.jpg" //To change body of created functions use File | Settings | File Templates.
    }

    override fun getName(): CharSequence? {
        return UUID.randomUUID().toString() //To change body of created functions use File | Settings | File Templates.
    }
}