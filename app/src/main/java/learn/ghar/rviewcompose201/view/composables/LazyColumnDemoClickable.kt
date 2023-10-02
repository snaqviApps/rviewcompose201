package learn.ghar.rviewcompose201.view.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun LazyColumnDemoClickable(itemSelected : (String) -> Unit) {
    LazyColumn {
        items(40){ count ->
            Text(
                text = "User name: ".plus(count),
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier
                    .padding(3.dp)
                    .clickable { itemSelected("$count item selected") }
            )
            Divider(color = Color.Blue, thickness = 2.dp)
        }
    }
}