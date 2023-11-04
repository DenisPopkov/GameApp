package ru.popkov.gameapp.screens.game.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.popkov.gameapp.R
import ru.popkov.gameapp.data.models.ReviewerModel
import ru.popkov.gameapp.ui.theme.DividerColor
import ru.popkov.gameapp.ui.theme.ModernistTextRegular12
import ru.popkov.gameapp.ui.theme.ModernistTextRegular16
import ru.popkov.gameapp.ui.theme.SecondTextColor
import ru.popkov.gameapp.ui.theme.ThirdTextColor

@Composable
fun ReviewerComponent(
    modifier: Modifier = Modifier,
    reviewer: ReviewerModel,
    isShouldShowDivider: Boolean = true
) {
    Column(modifier = modifier.padding(start = 24.dp)) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(space = 16.dp)
        ) {
            ReviewerImageComponent(
                modifier = modifier,
                reviewerImage = reviewer.reviewerImage
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 7.dp)
            ) {
                Text(
                    text = stringResource(id = reviewer.reviewerName),
                    color = Color.White,
                    style = ModernistTextRegular16
                )
                Text(
                    text = stringResource(id = reviewer.reviewDatePublished),
                    color = ThirdTextColor,
                    style = ModernistTextRegular12
                )
            }
        }
        Spacer(modifier = modifier.padding(top = 16.dp))
        Text(
            text = stringResource(id = reviewer.reviewComment),
            color = SecondTextColor,
            style = ModernistTextRegular12
        )
    }

    AnimatedVisibility(visible = isShouldShowDivider) {
        Divider(
            modifier = modifier.padding(horizontal = 38.dp, vertical = 24.dp),
            thickness = 1.dp,
            color = DividerColor
        )
    }
}

@Preview(showBackground = true, backgroundColor = 1)
@Composable
fun ReviewerComponentPreview() {
    ReviewerComponent(
        reviewer = ReviewerModel(
            reviewerName = R.string.first_reviewer_name,
            reviewDatePublished = R.string.first_review_date,
            reviewComment = R.string.first_reviewer_comment,
            reviewerImage = R.drawable.ic_first_reviewer
        )
    )
}