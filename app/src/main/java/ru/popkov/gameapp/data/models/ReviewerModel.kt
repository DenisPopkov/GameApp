package ru.popkov.gameapp.data.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ReviewerModel(
    @StringRes val reviewerName: Int,
    @StringRes val reviewDatePublished: Int,
    @StringRes val reviewComment: Int,
    @DrawableRes val reviewerImage: Int
)
