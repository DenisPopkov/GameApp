package ru.popkov.gameapp.common

import androidx.annotation.StringRes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import ru.popkov.gameapp.R
import ru.popkov.gameapp.ui.theme.MainTextColor
import ru.popkov.gameapp.ui.theme.MontserratTextMedium10

@Composable
fun TextComponent(
    modifier: Modifier = Modifier,
    @StringRes text: Int = R.string.game_description,
    textColor: Color = MainTextColor,
    lineHeight: TextUnit = 19.sp,
    textStyle: TextStyle = MontserratTextMedium10
) {
    Text(
        modifier = modifier,
        text = stringResource(id = text),
        color = textColor,
        lineHeight = lineHeight,
        style = textStyle
    )
}

@Preview(showBackground = true, backgroundColor = 1)
@Composable
fun TextComponentPreview() {
    TextComponent()
}