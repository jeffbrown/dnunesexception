package dnunesexception

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification
import org.grails.web.json.JSONObject

class PidServiceSpec extends Specification implements ServiceUnitTest<PidService>{

    void "test something"() {
        when:
        JSONObject documentWithoutIssuingNumber = new JSONObject()
        documentWithoutIssuingNumber.accumulate("docIssuingNumber","123")
        service.buildPidIssuingOrder(documentWithoutIssuingNumber)

        then:
        def e = thrown(Exception)

        and:
        e.message == 'Document issuing number is mandatory'

    }
}
