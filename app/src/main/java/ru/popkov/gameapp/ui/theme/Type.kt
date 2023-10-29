package ru.popkov.gameapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ru.popkov.gameapp.R

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

val MontserratTextMedium10 = TextStyle(
    fontSize = 10.sp,
    fontWeight = FontWeight.Medium,
    fontFamily = FontFamily(Font(R.font.montserrat_medium)),
)

val ModernistTextRegular12 = TextStyle(
    fontSize = 12.sp,
    fontWeight = FontWeight.Normal,
    fontFamily = FontFamily(Font(R.font.modernist_regular)),
)

val ModernistTextRegular16 = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.Normal,
    fontFamily = FontFamily(Font(R.font.modernist_regular)),
)

val ModernistTextBold16 = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = FontFamily(Font(R.font.modernist_bold)),
)

val ModernistTextBold20 = TextStyle(
    fontSize = 20.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = FontFamily(Font(R.font.modernist_bold)),
)

val ModernistTextBold48 = TextStyle(
    fontSize = 48.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = FontFamily(Font(R.font.modernist_bold)),
)