package ru.popkov.gameapp.data.models

import androidx.annotation.DrawableRes

data class CarouselMediaModel(
    @DrawableRes val media: Int,
    val mediaType: CarouselType
)
