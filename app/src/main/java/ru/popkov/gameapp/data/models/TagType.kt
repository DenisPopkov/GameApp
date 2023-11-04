package ru.popkov.gameapp.data.models

import androidx.annotation.StringRes
import ru.popkov.gameapp.R

enum class TagType(@StringRes val tagName: Int) {
    Moba(tagName = R.string.first_tag),
    Multiplayer(tagName = R.string.second_tag),
    Strategy(tagName = R.string.third_tag);
}