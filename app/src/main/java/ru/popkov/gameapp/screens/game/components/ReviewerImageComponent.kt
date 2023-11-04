package ru.popkov.gameapp.screens.game.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.popkov.gameapp.R

@Composable
fun ReviewerImageComponent(
    modifier: Modifier = Modifier,
    @DrawableRes reviewerImage: Int = R.drawable.ic_first_reviewer
) {
    Image(
        modifier = modifier
            .size(36.dp)
            .clip(CircleShape),
        painter = painterResource(id = reviewerImage),
        contentDescription = "Reviewer image"
    )
}

@Preview(showBackground = true)
@Composable
fun ReviewerImageComponentPreview() {
    ReviewerImageComponent()
}