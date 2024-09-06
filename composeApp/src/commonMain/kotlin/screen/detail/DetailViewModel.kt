package screen.detail

import androidx.lifecycle.ViewModel
import domain.Repository

class DetailViewModel(private val repo: Repository): ViewModel() {
    init {

        println("Detail ViewModel initializing...")
    }

    override fun onCleared() {
        super.onCleared()
        println("Detail ViewModel clearing...")
    }
}