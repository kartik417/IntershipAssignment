package com.example.recipeapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment

@Composable
fun RecipeScreen(modifier: Modifier = Modifier){
    val recipeModel: MainViewModel = viewModel()
    val viewState by recipeModel.categoriesState
    Box(modifier = Modifier.fillMaxSize()){
        when{
            viewState.isLoading->{
                CircularProgressIndicator(modifier.align(Alignment.Center))
            }
            viewState.error!=null->{
                Text("ERROR OCCURRED")
            }
            else->{
                
            }
        }

    }
}