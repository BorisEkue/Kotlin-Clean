package com.paul.entity

data class Candidate(
    override var id: Int? = 0,
    override var topic: String = "candidate",
    override var avscFilename: String = "",
    override var name: String = "",
    var politicalPartyId: Int = 0,
    var politicalPartyName: String = "",
    var politicalPostId: Int = 0,
    var politicalPostName: String = "",
    var nationalId: String = ""
): BaseEntity<Int>(){

    override fun toMap(): HashMap<Any, Any> {
        return super.toMap().apply {
            this["id"] = id!!
            this["politicalPartyId"] = politicalPartyId
            this["politicalPartyName"] = politicalPartyName
            this["politicalPostId"] = politicalPostId
            this["politicalPostName"] = politicalPostName
            this["nationalId"] = nationalId
        }
    }

}