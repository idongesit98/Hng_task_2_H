package com.zseni.hng_task_2

sealed class Screen(val route:String) {
    object Home:Screen(route = "home_screen")
    object Editing:Screen(route = "editing_screen")
}