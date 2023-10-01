package learn.ghar.rviewcompose201

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumnDemo()
        }
    }
}


/**
@Composable
fun ScrollableColumn(){
    val scrolState = rememberScrollState()
    val textInput = "User account: "
    Column(
        modifier = Modifier.verticalScroll(scrolState) ) {
        for (i in 1..40) {
            Text(
                text = textInput.plus(i),
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier
                    .padding(3.dp)
            )
            Divider(color = Color.Black, thickness = 3.dp)
        }
    }
}
 */
@Composable
private fun LazyColumnDemo() {
    LazyColumn {
        items(40){ count ->
            Text(
                text = "User name: ".plus(count),
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier
                    .padding(3.dp)
            )
            Divider(color = Color.Blue, thickness = 2.dp)
        }
    }
}