package ru.popkov.gameapp.common

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.popkov.gameapp.R
import ru.popkov.gameapp.ui.theme.ButtonBackgroundColor
import ru.popkov.gameapp.ui.theme.ModernistTextBold20

@Composable
fun ButtonComponent(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    @DrawableRes buttonContainerColor: Color = ButtonBackgroundColor,
    @StringRes buttonText: Int = R.string.install_button_label,
    buttonColor: Color = Color.Black
) {
    TextButton(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(height = 64.dp),
        shape = RoundedCornerShape(size = 12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = buttonContainerColor),
    ) {
        TextComponent(
            modifier = modifier,
            text = buttonText,
            textColor = buttonColor,
            lineHeight = 24.sp,
            textStyle = ModernistTextBold20
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonComponentPreview() {
    ButtonComponent()
}