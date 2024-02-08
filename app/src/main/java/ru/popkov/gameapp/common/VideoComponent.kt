package ru.popkov.gameapp.common

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import ru.popkov.gameapp.R

@Composable
fun VideoComponent(
    modifier: Modifier = Modifier,
    @DrawableRes video: Int = R.drawable.ic_first_carousel_image,
    contentDescription: String = "Common video"
) {
    Image(
        modifier = modifier,
        painter = painterResource(id = video),
        contentDescription = contentDescription
    )
}

@Preview(showBackground = true)
@Composable
fun VideoComponentComponentPreview() {
    VideoComponent()
}