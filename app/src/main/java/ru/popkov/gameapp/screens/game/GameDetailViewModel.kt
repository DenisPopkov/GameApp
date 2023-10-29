package ru.popkov.gameapp.screens.game

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import ru.popkov.gameapp.data.interactor.GameDetailInteractor
import ru.popkov.gameapp.data.models.GameDetailsState
import javax.inject.Inject

@HiltViewModel
class GameDetailViewModel @Inject constructor(
    private val gameDetailInteractor: GameDetailInteractor
) : ViewModel() {

    private val _gameDetailData = MutableStateFlow(GameDetailsState())
    val gameDetailData: StateFlow<GameDetailsState> = _gameDetailData

    init {
        getGameDetail()
    }

    private fun getGameDetail() {
        viewModelScope.launch {
            try {
                _gameDetailData.value = gameDetailData.value.copy(isLoading = true)
                _gameDetailData.value = _gameDetailData.value.copy(
                    gameDetailsModel = gameDetailInteractor.loadGameDetail(),
                    isLoading = false
                )
            } catch (e: Exception) {
                _gameDetailData.value = gameDetailData.value.copy(isLoading = false)
            }
        }
    }
}