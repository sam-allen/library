package com.sallen

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(BookReview)
class BookReviewSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

     void dateValidBookReview() {
        when: "A book review is created with a book name and date published"
        def bookReview = new BookReview (book:'Computing for dummies', datePublished:'test')
	then: "Validation test should fail"
	!bookReview.validate()
    }
}
