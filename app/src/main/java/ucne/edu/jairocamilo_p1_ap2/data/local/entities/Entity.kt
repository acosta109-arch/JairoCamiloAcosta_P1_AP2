package ucne.edu.jairocamilo_p1_ap2.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("Entity")
data class Entity(
    @PrimaryKey
    val entityId: Int? = null
)