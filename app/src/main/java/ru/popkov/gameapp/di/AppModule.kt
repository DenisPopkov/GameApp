package ru.popkov.gameapp.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.popkov.gameapp.data.interactor.GameDetailRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
//    @Binds
    fun provideGameDetailsRepository(): GameDetailRepository {
        return GameDetailRepository()
    }
}