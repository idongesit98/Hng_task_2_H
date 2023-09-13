package com.zseni.hng_task_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zseni.hng_task_2.navigation.SetupNavGraph
import com.zseni.hng_task_2.presentation.featureAdd.viewModel.EditViewModel
import com.zseni.hng_task_2.ui.theme.Hng_task_2Theme

class MainActivity : ComponentActivity() {
    lateinit var navController:NavHostController
    private val viewModel:EditViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hng_task_2Theme {
                Surface(
                    // A surface container using the 'background' color from the theme
                    color = MaterialTheme.colorScheme.background
                ) {

                    navController = rememberNavController()
                    SetupNavGraph(navController = navController, viewModel = viewModel)
                }


            }
        }
    }
}

