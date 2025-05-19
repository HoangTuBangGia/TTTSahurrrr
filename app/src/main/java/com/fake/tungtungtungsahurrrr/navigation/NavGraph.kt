package com.fake.tungtungtungsahurrrr.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.fake.tungtungtungsahurrrr.screens.AddThreads
import com.fake.tungtungtungsahurrrr.screens.BottomNav
import com.fake.tungtungtungsahurrrr.screens.Home
import com.fake.tungtungtungsahurrrr.screens.Login
import com.fake.tungtungtungsahurrrr.screens.Notification
import com.fake.tungtungtungsahurrrr.screens.OtherUser
import com.fake.tungtungtungsahurrrr.screens.Profile
import com.fake.tungtungtungsahurrrr.screens.Register
import com.fake.tungtungtungsahurrrr.screens.Search
import com.fake.tungtungtungsahurrrr.screens.Splash

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.Splash.routes) {

        composable(Routes.Splash.routes) {
            Splash(navController)
        }

        composable(Routes.Home.routes) {
            Home(navController)
        }

        composable(Routes.Notification.routes) {
            Notification()
        }

        composable(Routes.Search.routes) {
            Search(navController)
        }

        composable(Routes.AddThread.routes) {
            AddThreads(navController)
        }

        composable(Routes.Profile.routes) {
            Profile(navController)
        }

        composable(Routes.BottomNav.routes) {
            BottomNav(navController)
        }

        composable(Routes.Login.routes) {
            Login(navController)
        }

        composable(Routes.Register.routes) {
            Register(navController)
        }

        composable(Routes.OtherUser.routes) {
            val data = it.arguments!!.getString("data")

            OtherUser(navController, data!!)
        }
    }
}