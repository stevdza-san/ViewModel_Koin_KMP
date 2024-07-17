package screen.home

import androidx.lifecycle.ViewModel
import domain.Repository

class HomeViewModel(private val repo: Repository): ViewModel() {
    init {
        println("Home ViewModel initializing...")
    }

    override fun onCleared() {
        super.onCleared()
        println("Home ViewModel clearing...")
    }
}