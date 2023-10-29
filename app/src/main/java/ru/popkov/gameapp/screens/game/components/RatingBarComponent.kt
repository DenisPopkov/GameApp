package ru.popkov.gameapp.screens.game.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.popkov.gameapp.R

@Composable
fun RatingBarComponent(
    modifier: Modifier = Modifier,
    ratingValue: Float = 5f
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        repeat(ratingValue.toInt()) {
            Image(
                modifier = modifier.size(size = 12.dp),
                painter = painterResource(R.drawable.ic_star),
                contentDescription = "Full star"
            )
        }

        if (ratingValue % 1f == 0.5f) {
            Image(
                modifier = modifier.size(size = 12.dp),
                painter = painterResource(R.drawable.ic_star_half),
                contentDescription = "Half star"
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 1)
@Composable
fun RatingBarComponentPreview() {
    RatingBarComponent()
}