package di

import data.MyRepository
import domain.Repository
import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module
import screen.detail.DetailViewModel
import screen.home.HomeViewModel

val appModule = module {
    single<Repository> { MyRepository() }
    viewModel { HomeViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}

fun initializeKoin() {
    startKoin {
        modules(appModule)
    }
}