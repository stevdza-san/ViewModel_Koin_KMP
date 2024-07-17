package data

import domain.Repository

class MyRepository: Repository {
    override fun readTimestamp() {
        println("Reading a timestamp from a preferences.")
    }
    override fun saveTimestamp() {
        println("Saving a timestamp to a preferences.")
    }
}