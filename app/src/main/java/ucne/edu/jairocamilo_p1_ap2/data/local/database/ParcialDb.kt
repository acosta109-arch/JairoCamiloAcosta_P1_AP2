package ucne.edu.jairocamilo_p1_ap2.data.local.database

import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase
import ucne.edu.jairocamilo_p1_ap2.data.local.dao.Dao

@Database(
    entities = [Entity::class],
    version = 1,
    exportSchema = false
)

abstract class ParcialDb(): RoomDatabase(){
    abstract fun parcialDao(): Dao
}