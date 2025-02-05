package ucne.edu.jairocamilo_p1_ap2.data.repository

import kotlinx.coroutines.flow.Flow
import ucne.edu.jairocamilo_p1_ap2.data.local.database.SistemaDb
import javax.inject.Inject
import ucne.edu.jairocamilo_p1_ap2.data.local.entities.SistemasEntity

class SistemaRepository @Inject constructor(
    private val sistemaDb: SistemaDb
) {
    suspend fun saveSistema(sistema: SistemasEntity){
        sistemaDb.sistemaDao().save(sistema)
    }

    suspend fun find(id: Int): SistemasEntity?{
        return sistemaDb.sistemaDao().find(id)
    }

    suspend fun delete(sistema: SistemasEntity){
        return sistemaDb.sistemaDao().delete(sistema)
    }

    fun getAll(): Flow<List<SistemasEntity>> {
        return sistemaDb.sistemaDao().getAll()
    }

}