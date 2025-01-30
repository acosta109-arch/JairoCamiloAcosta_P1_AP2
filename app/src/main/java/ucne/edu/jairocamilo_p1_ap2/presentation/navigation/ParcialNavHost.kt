package ucne.edu.jairocamilo_p1_ap2.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController


@Composable
fun AppNavHost(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.ParcialList
    ) {
        composable<Screen.ParcialList> {

        }
    }
}

