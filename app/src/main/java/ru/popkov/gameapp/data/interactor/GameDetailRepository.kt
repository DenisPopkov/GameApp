package ru.popkov.gameapp.data.interactor

import ru.popkov.gameapp.R
import ru.popkov.gameapp.data.models.CarouselMediaModel
import ru.popkov.gameapp.data.models.CarouselType
import ru.popkov.gameapp.data.models.GameDetailsModel
import ru.popkov.gameapp.data.models.ReviewerModel
import ru.popkov.gameapp.data.models.TagType

class GameDetailRepository {
    fun loadGameDetail(): GameDetailsModel {
        return gameDetailMock
    }
}

val gameDetailMock = GameDetailsModel(
    gameTags = listOf(
        TagType.Moba,
        TagType.Multiplayer,
        TagType.Strategy,
    ),
    gameReview = listOf(
        ReviewerModel(
            reviewerName = R.string.first_reviewer_name,
            reviewDatePublished = R.string.first_review_date,
            reviewComment = R.string.first_reviewer_comment,
            reviewerImage = R.drawable.ic_first_reviewer
        ),
        ReviewerModel(
            reviewerName = R.string.second_reviewer_name,
            reviewDatePublished = R.string.second_review_date,
            reviewComment = R.string.second_reviewer_comment,
            reviewerImage = R.drawable.ic_second_reviewer
        ),
    ),
    gameCarousel = listOf(
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