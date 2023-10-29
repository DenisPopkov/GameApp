package ru.popkov.gameapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.popkov.gameapp.data.interactor.GameDetailInteractor
import ru.popkov.gameapp.data.interactor.GameDetailInteractorImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideGameDetailsInteractor(): GameDetailInteractor {
        return GameDetailInteractorImpl()
    }
}