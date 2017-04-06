package com.sallen

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void maxSizeValidCourse() {
        when: "A course is created with a title and a code"
        def course = new Course (title:'Computing', code:'3333333333')
	then: "Validation test should fail"
	!course.validate()
    }
	
    void sizeValidCourse() {
        when: "A course is created with a title and a studyMode"
        def course = new Course (title:'Computing', studyMode:'0000000000000000000000000')
	then: "Validation test should fail"
	!course.validate()
    }
}
