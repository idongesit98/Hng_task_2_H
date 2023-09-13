package com.zseni.hng_task_2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.zseni.hng_task_2.Screen
import com.zseni.hng_task_2.presentation.featureAdd.component.AddCvScreen
import com.zseni.hng_task_2.presentation.featureAdd.viewModel.EditViewModel
import com.zseni.hng_task_2.presentation.featureCvScreen.CvScreen

@Composable
fun SetupNavGraph(
    viewModel: EditViewModel,
    navController: NavHostController,
){
    //val viewModel = AddEditCvViewModel(cvUseCase,repositoryImpl)
    NavHost(
        navController = navController, 
        startDestination = Screen.Home.route
    ){
        composable(
            route = Screen.Home.route
        ){
            CvScreen(
                navController = navController,
                viewModel = viewModel)
        }
        composable(
            route = Screen.Editing.route
        ){
            AddCvScreen(
                onEditFinished = {},
                navController = navController,
                viewModel = viewModel
            )
        }
        
    }
    
}