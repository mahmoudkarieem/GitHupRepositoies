package com.example.githuprepo.presentaion.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githuprepo.R
import com.example.githuprepo.presentaion.component.AppBar
import com.example.githuprepo.presentaion.theme.GitHupRepoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NetworkErrorScreen(
    modifier: Modifier = Modifier,
    onClickListenerButton: () -> Unit = {}
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            AppBar(
                title = stringResource(R.string.github_repositories_title_app_bar),
                titleStyle = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,

                )
        }
    )
    { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 16.dp)
                .padding(top = 122.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(325.dp),
                painter = painterResource(id = R.drawable.network_image_error),
                contentDescription = stringResource(R.string.network_image_error_screen_error)
            )
            Text(
                text = stringResource(R.string.something_went_wrong_text_screen_network_error),
                modifier.padding(top = 20.dp),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = stringResource(R.string.network_error_text), modifier.padding(top = 16.dp),
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleLarge,

                )
            Button(
                onClick = onClickListenerButton,
                modifier
                    .padding(top = 82.dp)
                    .padding(horizontal = 16.dp)

                    .fillMaxWidth()
                    .height(55.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Green,
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.onPrimary,
                    contentColor = Color.Blue
                ),

                )
            {
                Text(
                    text = stringResource(R.string.text_title_button_retry_screen_network_error),
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.Green,
                )
            }


        }


    }
}

@Preview
@Composable
private fun PreviewNetworkErrorScreen() {
    GitHupRepoTheme {
        NetworkErrorScreen(

        )

    }

}