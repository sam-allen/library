package com.sallen

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void emailValidLibrarian() {
        when: "A librarian is created with a email and name"
        def librarian = new Librarian (name:'Shane Allen', email:'sallen.yahoo.com')
	then: "Validation test should fail"
	!librarian.validate()
    }
}
