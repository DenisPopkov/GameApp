package ru.popkov.gameapp.screens.game.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.popkov.gameapp.R
import ru.popkov.gameapp.common.VideoComponent
import ru.popkov.gameapp.data.models.CarouselMediaModel
import ru.popkov.gameapp.data.models.CarouselType

@Composable
fun CarouselComponent(
    modifier: Modifier = Modifier,
    carouselData: List<CarouselMediaModel>
) {
    LazyRow(
        modifier = modifier.padding(start = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(space = 15.dp)
    ) {
        items(carouselData.size) {
            when (carouselData[it].mediaType) {
                CarouselType.Image -> {
                    Image(
                        modifier = modifier
                            .size(width = 240.dp, height = 128.dp)
                            .clip(RoundedCornerShape(size = 14.dp)),
                        painter = painterResource(id = carouselData[it].media),
                        contentDescription = "Carousel image"
                    )
                }

                CarouselType.Video -> {
                    Box(contentAlignment = Alignment.Center) {
                        VideoComponent(
                            modifier = modifier
                                .size(width = 240.dp, height = 128.dp)
                                .clip(RoundedCornerShape(size = 14.dp)),
                            video = carouselData[it].media
                        )
                        Image(
                            modifier = modifier.size(size = 48.dp),
                            painter = painterResource(id = R.drawable.ic_blur_button),
                            contentDescription = "Play icon"
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 1)
@Composable
fun CarouselComponentPreview() {
    CarouselComponent(
        carouselData = listOf(
            CarouselMediaModel(
                media = R.drawable.ic_first_carousel_image,
                mediaType = CarouselType.Video
            ),
            CarouselMediaModel(
                media = R.drawable.ic_second_carousel_image,
                mediaType = CarouselType.Image
            ),
        )
    )
}