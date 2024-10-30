package com.itesm.test_sample_live

import org.junit.Assert.*
import org.junit.Test
import com.example.myapplication.User

class UserTest {

    @Test
    fun testIsAdult(){
        val user = User("John",20)
        assertTrue(user.isAdult())
    }

    @Test
    fun testIsNotAdult(){
        val user = User("John",17)
        assertFalse(user.isAdult())
    }

    @Test
    fun testIsTeenager(){
        val user = User("John",17)
        assertTrue(user.isTeenager())
    }

    @Test
    fun testIsNotTeenager(){
        val user = User("John",3)
        assertFalse(user.isTeenager())
    }

    @Test
    fun testIsChild(){
        val user = User("John",2)
        assertTrue(user.isChild())
    }

    @Test
    fun testIsNotChild(){
        val user = User("John",13)
        assertFalse(user.isChild())
    }

}