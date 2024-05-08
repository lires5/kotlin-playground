package org.epiro.kotlin.interfaces

import org.epiro.kotlin.classes.Course

interface CourseRepository {
    val isCoursePersisted: Boolean
    fun getById(id: Int): Course
    fun save(course: Course) : Int {
        println("Saving course: $course")
        return course.id
    }
}

interface Repository {
    fun getAll(): Any
}

class SqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false
    override fun getById(id: Int): Course {
        return Course(id, "Kotlin", "Epiro")
    }
    override fun getAll(): Any {
        return listOf(Course(1, "Kotlin", "Epiro"))
    }
}

class NoSqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false
    override fun getById(id: Int): Course {
        return Course(id, "Kotlin", "Epiro")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        println("Saving course in NoSQL: $course")
        return course.id
    }
}

interface A {
    fun doSomething() {
        println("Doing something in A")
    }
}

interface B {
    fun doSomething() {
        println("Doing something in B")
    }
}

class C : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("Doing something in C")
    }
}

fun main() {
    val courseRepository = SqlCourseRepository()
    val course = courseRepository.getById(1)
    val courseId = courseRepository.save(Course(2, "Java", "Epiro"))
    println("Course: ${course.name}, Author: ${course.author}")
    println(course)
    println("Course ID: $courseId")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val noSqlId = noSqlCourseRepository.save(Course(3, "Python", "Epiro"))
    println("Course ID: $noSqlId")
    println("Is course persisted: ${noSqlCourseRepository.isCoursePersisted}")

    val ab = C()
    ab.doSomething()
}