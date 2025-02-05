package ucne.edu.jairocamilo_p1_ap2.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Sistemas")
data class SistemasEntity(
    @PrimaryKey
    val sistemaId: Int? = null,
    val nombre: String = ""
)