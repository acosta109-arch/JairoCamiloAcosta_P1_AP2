package ucne.edu.jairocamilo_p1_ap2.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import androidx.room.Delete
import kotlinx.coroutines.flow.Flow
import ucne.edu.jairocamilo_p1_ap2.data.local.entities.Entity

@Dao
interface Dao {
    @Upsert
    suspend fun save(entity: Entity)

    @Query("""
        SELECT * 
        FROM Entity
        WHERE entityId = :id
        LIMIT 1
    """)
    suspend fun find(id: Int): Entity?

    @Delete
    suspend fun delete(tecnico: Entity)

    @Query("SELECT * FROM Entity")
    fun getAll(): Flow<List<Entity>>
}
