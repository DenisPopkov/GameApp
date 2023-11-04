package ru.popkov.gameapp.screens.game

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import ru.popkov.gameapp.R
import ru.popkov.gameapp.common.ButtonComponent
import ru.popkov.gameapp.common.ChipComponent
import ru.popkov.gameapp.screens.game.components.CarouselComponent
import ru.popkov.gameapp.screens.game.components.HeaderComponent
import ru.popkov.gameapp.screens.game.components.ReviewComponent
import ru.popkov.gameapp.screens.game.components.ReviewerComponent
import ru.popkov.gameapp.ui.theme.MainTextColor
import ru.popkov.gameapp.ui.theme.ModernistTextBold16
import ru.popkov.gameapp.ui.theme.ModernistTextRegular12
import ru.popkov.gameapp.ui.theme.ModernistTextRegular12_19

@Composable
fun GameDetailScreen(
    modifier: Modifier = Modifier,
    gameDetailViewModel: GameDetailViewModel = hiltViewModel()
) {
    val lazyListState = rememberLazyListState()
    val gameDetails by gameDetailViewModel.gameDetailData.collectAsState()
    val gameDetailsValue = gameDetails.gameDetailsModel

    AnimatedVisibility(visible = gameDetails.isLoading) {
        CircularProgressIndicator()
    }

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        state = lazyListState
    ) {
        item {
            HeaderComponent()
        }
        item {
            Spacer(modifier = modifier.padding(top = 90.dp))
            LazyRow(
                modifier = modifier.padding(start = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(space = 10.dp)
            ) {
                items(gameDetailsValue.gameTags.size) {
                    ChipComponent(
                        modifier = modifier,
                        chipText = gameDetailsValue.gameTags[it].tagName
                    )
                }
            }
        }
        item {
            Spacer(modifier = modifier.padding(top = 30.dp))
            Text(
                modifier = modifier.padding(start = 24.dp),
                text = stringResource(id = R.string.game_description),
                color = MainTextColor,
                style = ModernistTextRegular12_19
            )
        }
        item {
            Spacer(modifier = modifier.padding(top = 15.dp))
            CarouselComponent(carouselData = gameDetailsValue.gameCarousel)
        }
        item {
            Spacer(modifier = modifier.padding(top = 20.dp))
            Text(
                modifier = modifier.padding(start = 24.dp),
                text = stringResource(id = R.string.review_title),
                color = Color.White,
                style = ModernistTextBold16
            )
        }
        item {
            Spacer(modifier = modifier.padding(top = 12.dp))
            ReviewComponent()
        }
        itemsIndexed(gameDetailsValue.gameReview) { index, reviewer ->
            ReviewerComponent(
                modifier = modifier,
                reviewer = reviewer,
                isShouldShowDivider = index < gameDetailsValue.gameReview.lastIndex
            )
        }
        item {
            ButtonComponent(
                modifier = modifier
                    .padding(horizontal = 24.dp, vertical = 40.dp),
                buttonText = R.string.install_button_label
            )
        }
    }
}