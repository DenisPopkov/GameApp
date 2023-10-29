package ru.popkov.gameapp.common

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import ru.popkov.gameapp.R

@Composable
fun ImageComponent(
    modifier: Modifier = Modifier,
    @DrawableRes image: Int = R.drawable.ic_second_carousel_image,
    scale: ContentScale = ContentScale.Fit,
    contentDescription: String = "Common image"
) {
    Image(
        modifier = modifier,
        painter = painterResource(id = image),
        contentScale = scale,
        contentDescription = contentDescription
    )
}

@Preview(showBackground = true)
@Composable
fun ImageComponentComponentPreview() {
    ImageComponent()
}