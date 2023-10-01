package learn.ghar.rviewcompose201

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
            ScrollableColumn()
        }
    }
}


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
