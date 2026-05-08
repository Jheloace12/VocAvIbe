package com.vocavibe.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.vocavibe.data.entity.SessionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SessionDao {
    @Insert
    suspend fun insertSession(session: SessionEntity)

    @Query("SELECT * FROM sessions WHERE userId = :userId ORDER BY sessionDate DESC LIMIT 5")
    fun getRecentSessions(userId: String): Flow<List<SessionEntity>>

    @Query("SELECT * FROM sessions WHERE userId = :userId ORDER BY sessionDate DESC")
    fun getAllSessions(userId: String): Flow<List<SessionEntity>>

    @Query("SELECT AVG(accuracyPercentage) FROM sessions WHERE userId = :userId")
    fun getAverageAccuracy(userId: String): Flow<Double?>

    @Query("SELECT COUNT(*) FROM sessions WHERE userId = :userId AND sessionDate >= :startDate")
    fun getSessionCountSince(userId: String, startDate: Long): Flow<Int>
}
