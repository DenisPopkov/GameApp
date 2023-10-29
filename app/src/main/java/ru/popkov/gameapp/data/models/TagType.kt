package ru.popkov.gameapp.data.models

import androidx.annotation.StringRes
import ru.popkov.gameapp.R

enum class TagType(@StringRes val tagName: Int) {
    MOBA(tagName = R.string.first_tag),
    MULTIPLAYER(tagName = R.string.second_tag),
    STRATEGY(tagName = R.string.third_tag);
}