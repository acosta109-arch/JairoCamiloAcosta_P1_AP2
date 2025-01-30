package ucne.edu.jairocamilo_p1_ap2.presentation.navigation

import kotlinx.serialization.Serializable

sealed class Screen {
    @Serializable
    data object ParcialList : Screen()

}