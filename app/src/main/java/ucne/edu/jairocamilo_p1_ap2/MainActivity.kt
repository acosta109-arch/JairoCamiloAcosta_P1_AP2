package ucne.edu.jairocamilo_p1_ap2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import ucne.edu.jairocamilo_p1_ap2.ui.theme.JairoCamilo_P1_AP2Theme
import androidx.room.Room
import ucne.edu.jairocamilo_p1_ap2.presentation.navigation.AppNavHost

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JairoCamilo_P1_AP2Theme {
                val navHost = rememberNavController()
                AppNavHost(
                    navController = navHost
                )
            }
        }
    }
}

