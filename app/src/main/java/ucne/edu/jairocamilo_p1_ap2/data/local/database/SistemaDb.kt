package ucne.edu.jairocamilo_p1_ap2.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ucne.edu.jairocamilo_p1_ap2.data.local.dao.SistemasDao
import ucne.edu.jairocamilo_p1_ap2.data.local.entities.SistemasEntity

@Database(
    entities = [SistemasEntity::class],
    version = 3,
    exportSchema = false
)

abstract class SistemaDb(): RoomDatabase(){
    abstract fun sistemaDao(): SistemasDao
}