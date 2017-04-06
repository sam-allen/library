package com.sallen

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void nullValidBook() {
        when: "A book is created with a title, subject and author"
        def book = new Book (title:'Computing for dummies', subject:'IT', author:'')
	then: "Validation test should fail"
	!book.validate()
    }

    void maxSizeValidBook() {
        when: "A book is created with a title, subject and isbn"
        def book = new Book (title:'Computing for dummies', subject:'IT', isbn:'11111111111111111111')
	then: "Validation test should fail"
	!book.validate()
    }
}
