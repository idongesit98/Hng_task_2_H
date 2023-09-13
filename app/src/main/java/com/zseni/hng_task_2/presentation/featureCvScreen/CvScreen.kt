package com.zseni.hng_task_2.presentation.featureCvScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.zseni.hng_task_2.R
import com.zseni.hng_task_2.Screen
import com.zseni.hng_task_2.presentation.featureAdd.viewModel.EditViewModel

@Composable
fun CvScreen(
    viewModel: EditViewModel,
    navController: NavController
){ //val allItems = viewModel.allItems.collectAsState(initial = emptyList())

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxHeight()
            .background(color = Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        ConstraintLayout{
            val (topImage, profile) = createRefs()
            Image(painter = painterResource(
                id = R.drawable.background),
                contentDescription = null,
                Modifier
                    .fillMaxWidth()
                    .size(200.dp)
                    .constrainAs(topImage) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                    })
            Image(
                painter = painterResource(id = R.drawable.github),
                contentDescription = null,
                Modifier
                    .constrainAs(profile){
                        top.linkTo(topImage.bottom)
                        bottom.linkTo(topImage.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    })
                //for (allItems in allItems.value) {}
        }
        Text(
            text = "Name:${viewModel.name}",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
            )

        Text(
            text = "SlackName:${viewModel.slackName}",
            fontSize = 20.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier.padding(top= 10.dp)
        )

        Text(
            text = "Github:${viewModel.githubName}",
            fontSize = 15.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier.padding(top=10.dp)
        )

        Text(
            text = "Personal Bio:${viewModel.personalBio}",
            fontSize = 15.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.absolutePadding(top=10.dp,left = 5.dp, right = 5.dp))

        SmallFloatingActionButton(
            onClick = {
                navController.navigate(route = Screen.Editing.route)
            },
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.background
        ){
            Icon(Icons.Filled.Send, "Next")
        }
    }
}
@Preview
@Composable
fun CvScreenPreview(){
    val viewModel:EditViewModel = viewModel()
    CvScreen(navController = rememberNavController(), viewModel = viewModel)
}

