package dnunesexception

import org.grails.web.json.JSONObject

class PidService {
    def buildPidIssuingOrder(JSONObject pidIssuingConclusionDocument) {
            throw new Exception('Document issuing number is mandatory')
    }
}
