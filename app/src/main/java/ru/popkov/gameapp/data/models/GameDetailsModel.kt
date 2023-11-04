package ru.popkov.gameapp.data.models

data class GameDetailsModel(
    val gameTags: List<TagType> = emptyList(),
    val gameReview: List<ReviewerModel> = emptyList(),
    val gameCarousel: List<CarouselMediaModel> = emptyList()
)
