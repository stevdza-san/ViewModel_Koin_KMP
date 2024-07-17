package domain

interface Repository {
    fun readTimestamp()
    fun saveTimestamp()
}