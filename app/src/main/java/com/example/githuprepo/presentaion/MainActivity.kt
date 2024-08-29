package com.example.githuprepo.presentaion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.githuprepo.presentaion.navigation.AppNavHost
import com.example.githuprepo.presentaion.theme.GitHupRepoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitHupRepoTheme {
                AppNavHost()

            }
        }

    }
}

