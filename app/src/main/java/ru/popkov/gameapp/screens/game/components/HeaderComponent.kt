package ru.popkov.gameapp.screens.game.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import ru.popkov.gameapp.R
import ru.popkov.gameapp.ui.theme.Background
import ru.popkov.gameapp.ui.theme.ModernistTextBold20
import ru.popkov.gameapp.ui.theme.ModernistTextRegular12
import ru.popkov.gameapp.ui.theme.ThirdTextColor

@Composable
fun HeaderComponent(
    modifier: Modifier = Modifier
) {
    ConstraintLayout(modifier = modifier) {
        val (image, _) = createRefs()
        Image(
            modifier = modifier
                .fillMaxWidth()
                .height(height = 285.dp),
            painter = painterResource(id = R.drawable.ic_top_image),
            contentScale = ContentScale.FillWidth,
            contentDescription = "Top screen image"
        )

        Row(
            modifier = Modifier
                .constrainAs(image) {
                    bottom.linkTo(parent.bottom, margin = (-64).dp)
                    start.linkTo(parent.start, margin = (22).dp)
                }
        ) {
            LogoComponent()
            Column(
                modifier = Modifier.padding(top = 34.dp, start = 12.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.game_name),
                    color = Color.White,
                    style = ModernistTextBold20
                )
                Spacer(modifier = modifier.padding(top = 5.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RatingBarComponent()
                    Text(
                        modifier = modifier,
                        text = stringResource(id = R.string.game_rating_value),
                        color = ThirdTextColor,
                        style = ModernistTextRegular12
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 1)
@Composable
fun TopScreenComponentPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {
        HeaderComponent()
    }
}