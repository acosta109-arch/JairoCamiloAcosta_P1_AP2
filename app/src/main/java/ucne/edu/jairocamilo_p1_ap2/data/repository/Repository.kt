package ucne.edu.jairocamilo_p1_ap2.data.repository

import kotlinx.coroutines.flow.Flow
import ucne.edu.jairocamilo_p1_ap2.data.local.database.ParcialDb
import javax.inject.Inject
import ucne.edu.jairocamilo_p1_ap2.data.local.entities.Entity

class TecnicoRepository @Inject constructor(
    private val parcialDb: ParcialDb
) {
    suspend fun saveEntity(tecnico: Entity){
        parcialDb.parcialDao().save(tecnico)
    }

    suspend fun find(id: Int): Entity?{
        return parcialDb.parcialDao().find(id)
    }

    suspend fun delete(tecnico: Entity){
        return parcialDb.parcialDao().delete(tecnico)
    }

    fun getAll(): Flow<List<Entity>> {
        return parcialDb.parcialDao().getAll()
    }

}