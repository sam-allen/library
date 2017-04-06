package com.sallen

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
        when: "A Student has a name"
	def lee = new Student(name:'Lee Catling')
	then: "the toString method will display it."
	lee.toString()=='Lee Catling'
    }
}
