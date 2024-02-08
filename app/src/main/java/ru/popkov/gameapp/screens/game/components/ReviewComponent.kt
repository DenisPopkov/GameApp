package ru.popkov.gameapp.screens.game.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.popkov.gameapp.R
import ru.popkov.gameapp.ui.theme.ModernistTextBold48
import ru.popkov.gameapp.ui.theme.ModernistTextRegular12
import ru.popkov.gameapp.ui.theme.SecondTextColor

@Composable
fun ReviewComponent(
    modifier: Modifier = Modifier,
    ratingValue: Float = 4.9f
) {
    Row(
        modifier = modifier.padding(start = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(space = 16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.game_rating_review_value),
            color = Color.White,
            style = ModernistTextBold48
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 8.dp)
        ) {
            RatingBarComponent(
                modifier = modifier,
                ratingValue = ratingValue
            )
            Text(
                text = stringResource(id = R.string.game_review_description),
                color = SecondTextColor,
                style = ModernistTextRegular12
            )
        }
    }
    Spacer(modifier = modifier.padding(bottom = 32.dp))
}

@Preview(showBackground = true, backgroundColor = 1)
@Composable
fun ReviewComponentPreview() {
    ReviewComponent()
}