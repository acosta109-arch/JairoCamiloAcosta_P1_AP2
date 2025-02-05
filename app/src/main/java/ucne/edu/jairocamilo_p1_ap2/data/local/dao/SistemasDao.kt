package ucne.edu.jairocamilo_p1_ap2.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import androidx.room.Delete
import kotlinx.coroutines.flow.Flow
import ucne.edu.jairocamilo_p1_ap2.data.local.entities.SistemasEntity

@Dao
interface SistemasDao {
    @Upsert
    suspend fun save(sistema: SistemasEntity)

    @Query("""
        SELECT * 
        FROM Sistemas
        WHERE sistemaId = :id
        LIMIT 1
    """)
    suspend fun find(id: Int): SistemasEntity?

    @Delete
    suspend fun delete(sistema: SistemasEntity)

    @Query("SELECT * FROM Sistemas")
    fun getAll(): Flow<List<SistemasEntity>>
}
