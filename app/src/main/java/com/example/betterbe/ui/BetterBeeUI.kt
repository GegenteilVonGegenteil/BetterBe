package com.example.betterbe.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.betterbe.ui.components.BottomNavBar
import com.example.betterbe.ui.home.HomeView

enum class Routes(val route: String) {
    Home("home"),
    Manager("manager"),
    Add("add"),
    Edit("edit"),
    Detail("detail/{habitId}")
}

@Composable
fun HabitApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    Scaffold(
        modifier.fillMaxSize(),
        bottomBar = { BottomNavBar(navController) }
    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = Routes.Home.route
        ) {
            composable(Routes.Home.route) {
                Column(Modifier.padding(innerPadding)) {
                    HomeView(Modifier.padding(innerPadding))
                }
            }
            composable(Routes.Manager.route) {
                Column(Modifier.padding(innerPadding)) {

                }
            }
            composable(Routes.Add.route) {
                Column(Modifier.padding(innerPadding)) {

                }
            }
            composable(Routes.Edit.route) {
                Column(Modifier.padding(innerPadding)) {

                }
            }
            composable(
                route = Routes.Detail.route,
                arguments = listOf(navArgument("habitId") { type = NavType.IntType })
            ) {
                Column(Modifier.padding(innerPadding)) {

                }
            }
        }
    }
}