package com.sensordrive.inverter.dependency_injection

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
//import com.sensordrive.inverter.data.BunnyDatabase
//import com.sensordrive.inverter.data.data_access_objects.WeightDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton


@InstallIn(ApplicationComponent::class)
@Module
object DatabaseModule
{


//    @Provides
//    @Singleton
//    fun provideDatabase(@ApplicationContext appContext: Context): BunnyDatabase
//    {
//        return Room.databaseBuilder(
//            appContext,
//            BunnyDatabase::class.java,
//            // TODO: Use DB_NAME from ImmyuDatabase here?
//            "buddy"
//        ).build()
//    }
//
//    @Provides
//    @Singleton
//    fun provideWeightDao(database: BunnyDatabase): WeightDao
//    {
//        return database.weightDao()
//    }
//
//
//    @Singleton
//    @Provides
//    fun provideIoDispatcher() = Dispatchers.IO

    @Provides
    @Singleton
    fun provideSharedPreference(@ApplicationContext context: Context): SharedPreferences
    {
        return context.getSharedPreferences("com.sensordrive.inverter", Context.MODE_PRIVATE)
    }
}