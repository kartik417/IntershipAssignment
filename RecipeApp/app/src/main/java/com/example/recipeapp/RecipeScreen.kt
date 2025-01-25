package com.example.recipeapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent

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


@Composable
fun CategoryScreen(categories:List<Category>){
    LazyVerticalGrid(GridCells.Fixed(2), modifier = Modifier.fillMaxSize()) { }
}

// How each item look

@Composable
fun CategoryItem(category: Category){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = category.strCategory,
            color = Color.Black,
            style = TextStyle(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}