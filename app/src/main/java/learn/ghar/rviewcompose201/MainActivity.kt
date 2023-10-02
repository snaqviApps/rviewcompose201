package learn.ghar.rviewcompose201

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import learn.ghar.rviewcompose201.data.TvShowList
import learn.ghar.rviewcompose201.model.TvShow
import learn.ghar.rviewcompose201.view.composables.TvShowListItem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            LazyColumnDemo()
//            LazyColumnDemoClickable(itemSelected = { Toast.makeText(this, it, Toast.LENGTH_SHORT).show() }
            DisplayTvShows {
                Toast.makeText(this, it.name, Toast.LENGTH_SHORT).show()
            }
        }
    }
}

/**
 *  A new composable function to get the list of TvShow data and to display them using
 *  the lazyColumn.
 */
@Composable
private fun DisplayTvShows(selectedItem: (TvShow) -> Unit) {

    /**
     * in memory by using the remember composable. A value computed by remember is stored during the initial
     * composition, and returned during recomposition.
     */
    val tvShows = remember { TvShowList.tvShows }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items = tvShows,
            itemContent = {
                TvShowListItem(tvShow = it, selectedItem = selectedItem)
            }
        )
    }
}

