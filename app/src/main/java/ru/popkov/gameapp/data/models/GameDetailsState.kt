package ru.popkov.gameapp.data.models

data class GameDetailsState(
    val gameDetailsModel: GameDetailsModel = GameDetailsModel(),
    val isLoading: Boolean = false
)
