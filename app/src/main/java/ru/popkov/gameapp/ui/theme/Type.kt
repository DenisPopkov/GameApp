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
    lineHeight = 12.sp,
)

val ModernistTextRegular12 = TextStyle(
    fontSize = 12.sp,
    fontWeight = FontWeight.Normal,
    fontFamily = FontFamily(Font(R.font.modernist_regular)),
    lineHeight = 26.sp,
)

val ModernistTextRegular12_19 = TextStyle(
    fontSize = 12.sp,
    fontWeight = FontWeight.Normal,
    fontFamily = FontFamily(Font(R.font.modernist_regular)),
    lineHeight = 19.sp,
)

val ModernistTextRegular16 = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.Normal,
    fontFamily = FontFamily(Font(R.font.modernist_regular)),
    lineHeight = 20.sp,
)

val ModernistTextBold16 = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = FontFamily(Font(R.font.modernist_bold)),
    lineHeight = 19.sp,
)

val ModernistTextBold20 = TextStyle(
    fontSize = 20.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = FontFamily(Font(R.font.modernist_bold)),
    lineHeight = 24.sp,
)

val ModernistTextBold48 = TextStyle(
    fontSize = 48.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = FontFamily(Font(R.font.modernist_bold)),
    lineHeight = 58.sp,
)