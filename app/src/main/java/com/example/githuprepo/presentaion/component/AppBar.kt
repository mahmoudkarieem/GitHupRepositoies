package com.example.githuprepo.presentaion.component

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.githuprepo.R

import com.example.githuprepo.presentaion.theme.GitHupRepoTheme

@ExperimentalMaterial3Api
@Composable
fun AppBar(
    modifier: Modifier = Modifier,
    title: String,
    titleStyle: TextStyle = MaterialTheme.typography.titleLarge,
    backgroundColor: Color = MaterialTheme.colorScheme.primary,
    showBackArrow: Boolean = true,
    onBackArrowClicked: () -> Unit = {},
    fontWeight: FontWeight? = null
) {
    CenterAlignedTopAppBar(
        modifier = modifier.background(backgroundColor),
        title = {
            Text(
                text = title,
                style = titleStyle,
                fontWeight = fontWeight

            )
        },
        navigationIcon = {
            if (showBackArrow)
                IconButton(onClick = onBackArrowClicked) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.arrow_back_app_bar)
                    )
                }
        },
    )
}

@ExperimentalMaterial3Api
@Preview
@Composable
private fun PreviewAppBar() {
    GitHupRepoTheme {
     AppBar(title = "Github Repositories")

}
}