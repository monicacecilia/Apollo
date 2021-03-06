package org.bbop.apollo

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(RequestHandlingService)
@Mock([Sequence, FeatureLocation, Feature, MRNA])
class RequestHandlingServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "clean json"() {

        given: "a valid sequence to translate"
        String inputJSON = "\"{\\\"track\\\":\\\"chrI\\\",\\\"features\\\":[{\\\"location\\\":{\\\"fmin\\\":62840,\\\"fmax\\\":65405,\\\"strand\\\":1},\\\"type\\\":{\\\"cv\\\":{\\\"name\\\":\\\"sequence\\\"},\\\"name\\\":\\\"mRNA\\\"},\\\"name\\\":\\\"YAL041W\\\",\\\"children\\\":[{\\\"location\\\":{\\\"fmin\\\":62840,\\\"fmax\\\":65405,\\\"strand\\\":1},\\\"type\\\":{\\\"cv\\\":{\\\"name\\\":\\\"sequence\\\"},\\\"name\\\":\\\"exon\\\"}}]}],\\\"operation\\\":\\\"add_transcript\\\",\\\"clientToken\\\":\\\"9137872062024864552562677444\\\"}\""

        when: "the sequence string gets here"

        then: "it should be good"

    }
}
