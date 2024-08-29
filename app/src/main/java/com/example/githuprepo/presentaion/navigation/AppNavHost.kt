package com.example.githuprepo.presentaion.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.githuprepo.presentaion.screens.repos_details_screen.preview_data.repoDetailsUiModel
import com.example.githuprepo.presentaion.screens.repos_details_screen.DetailsScreen
import com.example.githuprepo.presentaion.screens.network_error_screen.NetworkErrorScreen

sealed class Screens(val route: String) {
    data object DetailsScreen : Screens("network_error_screen")
    data object NetWorkErrorScreen : Screens("details_screen")
}

@Composable
fun AppNavHost(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.NetWorkErrorScreen.route
    ) {
        composable(route = Screens.NetWorkErrorScreen.route) {
            NetworkErrorScreen(
                onClickListenerButton = {
                    navController.navigate(Screens.DetailsScreen.route)
                },
            )

        }
        composable(route = Screens.DetailsScreen.route) {
            DetailsScreen(repoDetailsUiModel = repoDetailsUiModel,
                onBackArrowClicked = {
                    navController.popBackStack()
                }
            )

        }
    }


}