package com.example.githuprepo.presentaion.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githuprepo.R

@Composable
fun DetailsItem(
    modifier: Modifier = Modifier,
    title:String,
    image:Int,



) {
    Text(
        text =title,
        modifier = Modifier.padding(start = 16.dp),
        style = MaterialTheme.typography.bodyLarge,
        textAlign = TextAlign.Center

    )
    Image(
        painter = painterResource(id = image),
        contentDescription = null,
        modifier = Modifier
            .size(32.dp)
            .padding(start = 8.dp)
    )

}

@Preview
@Composable
private fun PreviewDetailsItem() {

}