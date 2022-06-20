package com.birdeveloper.baseproject.di

import android.content.Context
import android.content.SharedPreferences
import com.birdeveloper.baseproject.utils.Constants
import com.birdeveloper.baseproject.utils.FavouriteManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SharedPreferenceModule {
    @Singleton
    @Provides
    fun provideSharedPreferences(@ApplicationContext context: Context) =
        context.getSharedPreferences(
            Constants.PREF_NAME, Context.MODE_PRIVATE
        )

    @Singleton
    @Provides
    fun provideSessionManager(preferences: SharedPreferences) =
        FavouriteManager(preferences)

}