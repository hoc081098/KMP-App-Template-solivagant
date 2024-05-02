package com.hoc081098.kmpapp

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.hoc081098.kmpapp.screens.list.ListScreen

@Composable
fun App() {
    MaterialTheme {
        Navigator(ListScreen)
    }
}
