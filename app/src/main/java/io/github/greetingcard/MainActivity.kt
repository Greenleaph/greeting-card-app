package io.github.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.JesusGil.R
import io.github.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Residence(address = "Fresh Prince of Bel Air, 251 N Bristol Ave, Los Angeles, CA 90049")
                }
            }
        }
    }
}

@Composable 
fun Residence(address: String) {
    val logo = painterResource(id = R.drawable.android_logo)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(Color.Black)
    ) {
        Image(
            painter = logo,
            contentDescription = "Android Logo",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .padding(32.dp)
                .size(150.dp)
                .border(3.dp, color = Color.White),
        )
        Text(
            text = "Address: \n$address",
            Modifier.padding(32.dp),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingCardTheme {
        Residence(address = "Fresh Prince of Bel Air, 251 N Bristol Ave, Los Angeles, CA 90049")
    }
}