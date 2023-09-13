package com.zseni.hng_task_2.presentation.featureAdd.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.zseni.hng_task_2.presentation.featureAdd.viewModel.EditViewModel

@Composable
fun AddCvScreen(
    viewModel:EditViewModel,
    navController:NavHostController,onEditFinished:()->Unit){
    var addName by remember { mutableStateOf(viewModel.name)}
    var addSlackName by remember { mutableStateOf(viewModel.slackName)}
    var addGithub by remember { mutableStateOf(viewModel.githubName)}
    var addPersonalBio by remember { mutableStateOf(viewModel.personalBio)}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Name:")
        TextFieldsCv(
            text = addName,
            onValueChange = {
                addName = it
               // viewModel.name = it
                },

            onFocusChange =
            {
                viewModel.name = it.toString()
            },

            singleLine = true,
            textStyle = MaterialTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "SlackName:")
        TextFieldsCv(
            text = addSlackName,
            onValueChange = {
                addSlackName = it
                //viewModel.slackName = it
                            },
            onFocusChange =
            {
               // viewModel.slackName = it.toString()
            },

            singleLine = true,
            textStyle = MaterialTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "GitHub:")
        TextFieldsCv(
            text = addGithub,
            onValueChange = {
                addGithub = it
                //viewModel.githubName = it
                            },
            onFocusChange =
            {
                viewModel.githubName = it.toString()
            },
            singleLine = true,
            textStyle = MaterialTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Personal Bio:")
        TextFieldsCv(
            text = addPersonalBio,
            onValueChange = {
                addPersonalBio = it
               // viewModel.personalBio= it
                            },
            onFocusChange =
            {
                viewModel.personalBio = it.toString()
            },
            singleLine = true,
            textStyle = MaterialTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.height(16.dp))
    }

    SmallFloatingActionButton(
        onClick = {
            viewModel.name = addName
            viewModel.slackName = addSlackName
            viewModel.githubName = addGithub
            viewModel.personalBio = addPersonalBio
            onEditFinished()
            navController.popBackStack()
        },
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.background
    ){
        Icon(Icons.Filled.Send, "Next")
    }
}
@Preview
@Composable
fun AddCvScreenPreview(){
}

