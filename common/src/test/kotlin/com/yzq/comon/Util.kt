package com.yzq.comon

import org.junit.jupiter.api.Test

/**
 * @author yanni
 * @date time 2022/3/17 23:38
 * @modified By:
 *
 */
class Util {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    private val list = listOf(1, 2, 3)
    @Test
    fun testMap(){
        map.forEach {
            println(it)
        }
        list.forEach {
            println(it)
        }
    }
    @Test
    fun  stringTest(){
        //sampleStart
        // Kotlin
        val countDown = buildString {
            for (i in 5 downTo 1) {
                append(i)
                appendLine()
            }
        }
        println(countDown)
//sampleEnd
    }
    @Test
    fun num(){
        //sampleStart
        // Kotlin
        val numbers = listOf(1, 2, 3, 4, 5, 6)
        val invertedOddNumbers = numbers
            .filter { it % 2 != 0 }
            .joinToString{ "${-it}" }
        println(invertedOddNumbers)
//sampleEnd
    }
}