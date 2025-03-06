package com.example.android_studio_searchbar_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_studio_searchbar_demo.ui.theme.AndroidstudiosearchbardemoTheme
import com.example.android_studio_searchbar_demo.view.SearchScreen
import com.example.android_studio_searchbar_demo.viewmodel.SearchBarViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val myViewModel by viewModels<SearchBarViewModel>()

        super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContent {
                AndroidstudiosearchbardemoTheme {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        SearchScreen(myViewModel, innerPadding)
                    }
                }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidstudiosearchbardemoTheme {
        //Greeting("Android")
    }
}