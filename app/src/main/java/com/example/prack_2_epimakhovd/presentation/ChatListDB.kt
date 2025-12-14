package com.example.prack_2_epimakhovd.presentation

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    version = 1,
    entities = [ChatListDbEntity::class]
)
abstract class ChatListDb: RoomDatabase() {
    abstract fun chatDao(): Dao

    companion object{
        fun getDb(context: Context) : ChatListDb{
            return Room.databaseBuilder(context, ChatListDb::class.java, "chat_db")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}