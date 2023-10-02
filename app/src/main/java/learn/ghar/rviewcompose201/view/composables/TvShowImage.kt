package learn.ghar.rviewcompose201.view.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import learn.ghar.rviewcompose201.model.TvShow

@Composable
fun TvShowImage(tvShow: TvShow) {
    Image(painter = painterResource(
        id = tvShow.imageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(3.dp)
            .height(120.dp)
            .width(80.dp)
            .clip(RoundedCornerShape(corner = CornerSize(7.dp)))
    )
}