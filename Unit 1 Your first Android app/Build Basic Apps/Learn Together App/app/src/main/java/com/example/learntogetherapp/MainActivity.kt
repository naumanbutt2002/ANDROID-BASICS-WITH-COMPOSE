package com.example.learntogetherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogetherapp.ui.theme.LearnTogetherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UIFunction(stringResource(R.string.heading_text),
                        stringResource(R.string.first_para),
                        stringResource(R.string.second_para)
                        )
                }
            }
        }
    }
}

@Composable
fun UIFunction(heading: String, first: String,second: String, modifier: Modifier = Modifier) {
    Column (){
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null,
            modifier=Modifier.fillMaxWidth()
        )

        Text(
            text=heading,
            fontSize = 24.sp,
            modifier= Modifier.padding(16.dp)

        )
        Text(
            text=first,
            modifier= Modifier.padding(16.dp,0.dp),
            textAlign = TextAlign.Justify,

            )
        Text(
            text=second,
            modifier= Modifier.padding(16.dp),
            textAlign = TextAlign.Justify,

            )
    }

}

@Preview(showBackground = true,
    showSystemUi=true,
    name="My Preview")
@Composable
fun UIFunctionPreview() {
    LearnTogetherAppTheme {
        UIFunction(stringResource(R.string.heading_text),
            stringResource(R.string.first_para),
            stringResource(R.string.second_para)
        )
    }
}