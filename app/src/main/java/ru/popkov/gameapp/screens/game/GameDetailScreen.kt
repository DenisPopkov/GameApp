package ru.popkov.gameapp.screens.game

import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import ru.popkov.gameapp.R
import ru.popkov.gameapp.common.ButtonComponent
import ru.popkov.gameapp.common.ChipComponent
import ru.popkov.gameapp.common.ImageComponent
import ru.popkov.gameapp.common.TextComponent
import ru.popkov.gameapp.common.VideoComponent
import ru.popkov.gameapp.data.models.CarouselType
import ru.popkov.gameapp.screens.game.components.HeaderComponent
import ru.popkov.gameapp.screens.game.components.ReviewComponent
import ru.popkov.gameapp.screens.game.components.ReviewerComponent
import ru.popkov.gameapp.ui.theme.MainTextColor
import ru.popkov.gameapp.ui.theme.ModernistTextBold16
import ru.popkov.gameapp.ui.theme.ModernistTextRegular12

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
            HeaderComponent(modifier = modifier.fillMaxSize())
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
            TextComponent(
                modifier = modifier.padding(start = 24.dp),
                text = R.string.game_description,
                textColor = MainTextColor,
                lineHeight = 19.sp,
                textStyle = ModernistTextRegular12
            )
        }
        item {
            Spacer(modifier = modifier.padding(top = 15.dp))
            LazyRow(
                modifier = modifier.padding(start = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(space = 15.dp)
            ) {
                items(gameDetailsValue.gameCarousel.size) {
                    when (gameDetailsValue.gameCarousel[it].mediaType) {
                        CarouselType.IMAGE -> {
                            ImageComponent(
                                modifier = modifier
                                    .size(width = 240.dp, height = 128.dp)
                                    .clip(RoundedCornerShape(size = 14.dp)),
                                image = gameDetailsValue.gameCarousel[it].media
                            )
                        }

                        CarouselType.VIDEO -> {
                            Box(contentAlignment = Alignment.Center) {
                                VideoComponent(
                                    modifier = modifier
                                        .size(width = 240.dp, height = 128.dp)
                                        .clip(RoundedCornerShape(size = 14.dp)),
                                    video = gameDetailsValue.gameCarousel[it].media
                                )
                                ImageComponent(
                                    modifier = modifier.size(size = 48.dp),
                                    image = R.drawable.ic_blur_button,
                                    contentDescription = "Play icon"
                                )
                            }
                        }

                        else -> Log.e("GameDetailScreen: ", "Unknown carousel type!")
                    }
                }
            }
        }
        item {
            Spacer(modifier = modifier.padding(top = 20.dp))
            TextComponent(
                modifier = modifier.padding(start = 24.dp),
                text = R.string.review_title,
                textColor = Color.White,
                lineHeight = 19.sp,
                textStyle = ModernistTextBold16
            )
        }
        item {
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
            Spacer(modifier = modifier.padding(top = 40.dp))
            ButtonComponent(
                modifier = modifier.padding(horizontal = 24.dp),
                buttonText = R.string.install_button_label
            )
            Spacer(modifier = modifier.padding(bottom = 40.dp))
        }
    }
}