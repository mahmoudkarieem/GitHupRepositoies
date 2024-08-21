package com.example.githuprepo.presentaion.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githuprepo.R
import com.example.githuprepo.presentaion.component.AppBar
import com.example.githuprepo.presentaion.component.DetailsItem
import com.example.githuprepo.presentaion.data.RepoDetailsUiModel
import com.example.githuprepo.presentaion.theme.GitHupRepoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(
    modifier: Modifier = Modifier,
    repoDetailsUiModel: RepoDetailsUiModel,
    onClickListenerButtonIssues: () -> Unit = {}

) {
    Scaffold(
        topBar = {
            AppBar(
                title = "Details",
                titleStyle = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        }
    ) { innerPadding ->
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = repoDetailsUiModel.imageUrl),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 6.dp)
                    .padding(horizontal = 85.dp)
                    .size(170.dp)
                    .fillMaxWidth()
            )
            Text(
                text = repoDetailsUiModel.title,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                DetailsItem(
                    modifier = Modifier,
                    title = repoDetailsUiModel.starsNumber,
                    image = R.drawable.baseline_star_24
                )
                Text(
                    modifier = Modifier.padding(start = 32.dp),
                    text = repoDetailsUiModel.language,
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center

                )
                Box(
                    modifier = Modifier
                        .padding(start = 6.dp)
                        .size(18.dp)
                        .clip(RoundedCornerShape(40))
                        .background(Color.Blue)
                )

                DetailsItem(
                    modifier = Modifier,
                    title = "347",
                    image = R.drawable.baseline_drag_indicator_24
                )
            }
            Text(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .padding(horizontal = 16.dp),
                text = repoDetailsUiModel.description,
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Start,


                )
            Spacer(modifier = Modifier.weight(1f))
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
                    .padding(horizontal = 16.dp),
                onClick = onClickListenerButtonIssues,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                ),
                shape = ButtonDefaults.shape
            ) {
                Text(
                    text = "Show issues",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,

                    )

            }


        }
    }
}


@Preview
@Composable
fun PreviewDetailsScreen() {
    GitHupRepoTheme {
        DetailsScreen(
            repoDetailsUiModel = RepoDetailsUiModel(
                imageUrl = R.drawable.google_image,
                title = "language",
                starsNumber = "1525",
                language = "Python",
                description = "Shared repository for open-sourced projects from the Google AI                     language team"
            )
        )
    }
}


//painter = rememberAsyncImagePainter(
//                    ImageRequest.Builder(LocalContext.current)
//                        .data(data = repoDetailsUiModel.imageUrl)
//                        .apply(block = fun ImageRequest.Builder.() {
//                            crossfade(1000)
//                            placeholder(R.drawable.ic_launcher_foreground)
//                        }).build(),
//                ), contentDescription = null