package learn.ghar.rviewcompose201.view

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import learn.ghar.rviewcompose201.model.TvShow
import learn.ghar.rviewcompose201.view.ui.theme.RViewCompose201Theme

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
class DetailsActivity : ComponentActivity() {

    companion object {
        private val TvShowID = "tvShowId"
        fun receiveIntent(context: Context, tvShow: TvShow) =
            Intent(context, DetailsActivity::class.java).apply {
                putExtra(TvShowID, tvShow)
            }
    }

    private val tvShowInfoReceived : TvShow by lazy {
        intent?.getSerializableExtra(TvShowID, TvShow::class.java) as TvShow
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DetailsInfo(tvShow = tvShowInfoReceived)
        }
    }
}

@Composable
fun DetailsInfo(tvShow: TvShow) {
    val scrollState: ScrollState = rememberScrollState()

    Card(
        modifier = Modifier.padding(10.dp),
        elevation = CardDefaults.cardElevation(0.dp, 0.dp, 0.dp, 0.dp, 0.dp, 10.dp),
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(scrollState)
                .padding(10.dp)
        ) {
            Image(painter = painterResource(
                id = tvShow.imageId),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .padding(3.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(5.dp))
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = tvShow.name, style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = tvShow.overview, style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Original Release: ${tvShow.year}", style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "IMBD :  ${tvShow.rating}", style = MaterialTheme.typography.headlineSmall)
        }
    }
}
