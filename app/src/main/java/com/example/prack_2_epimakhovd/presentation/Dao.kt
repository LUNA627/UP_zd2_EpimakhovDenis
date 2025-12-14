package com.example.prack_2_epimakhovd.presentation


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface Dao {
    @Query("select * from chat_list")
    fun getAll(): List<ChatListDbEntity>

    @Insert
    fun insertAll(vararg chats: ChatListDbEntity)
}