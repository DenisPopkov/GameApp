package ru.popkov.gameapp.common

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.popkov.gameapp.R
import ru.popkov.gameapp.ui.theme.MontserratTextMedium10
import ru.popkov.gameapp.ui.theme.TagBackgroundColor
import ru.popkov.gameapp.ui.theme.TagTextColor

@Composable
fun ChipComponent(
    modifier: Modifier = Modifier,
    @StringRes chipText: Int = R.string.first_tag,
    @DrawableRes chipTextColor: Color = TagTextColor,
    @DrawableRes chipContainerColor: Color = TagBackgroundColor,
) {
    AssistChip(
        modifier = modifier.height(height = 22.dp),
        onClick = {},
        shape = RoundedCornerShape(100.dp),
        border = null,
        colors = AssistChipDefaults.assistChipColors(containerColor = chipContainerColor),
        label = {
            Text(
                modifier = modifier,
                text = stringResource(id = chipText),
                color = chipTextColor,
                style = MontserratTextMedium10
            )
        }
    )
}

@Preview(showBackground = true, backgroundColor = 1)
@Composable
fun ChipComponentPreview() {
    ChipComponent()
}