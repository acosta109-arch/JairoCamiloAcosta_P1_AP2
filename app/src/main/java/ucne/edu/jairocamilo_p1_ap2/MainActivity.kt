package ucne.edu.jairocamilo_p1_ap2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import ucne.edu.jairocamilo_p1_ap2.ui.theme.JairoCamilo_P1_AP2Theme
import androidx.room.Room
import ucne.edu.jairocamilo_p1_ap2.data.local.database.SistemaDb
import ucne.edu.jairocamilo_p1_ap2.presentation.navigation.registro_parcial

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JairoCamilo_P1_AP2Theme {
                val navHost = rememberNavController()
                val sistemaDb = Room.databaseBuilder(
                    applicationContext,
                    SistemaDb::class.java,
                    "ParcialDb"
                ).build()

                registro_parcial(
                    navHostController = navHost,
                    sistemaDb = sistemaDb
                )
            }
        }
    }
}


