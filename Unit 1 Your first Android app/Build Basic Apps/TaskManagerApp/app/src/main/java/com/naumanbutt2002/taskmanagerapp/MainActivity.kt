package com.naumanbutt2002.taskmanagerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.naumanbutt2002.taskmanagerapp.ui.theme.TaskManagerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    UIFunction(
                        stringResource(R.string.heading_text),
                        stringResource(R.string.first_para)
                    )                }
            }
        }
    }
}

@Composable
fun UIFunction(heading: String, first: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = null,
        )

        Text(
            text=heading,
            fontWeight= FontWeight.Bold,
            modifier= Modifier.padding(top=24.dp,bottom=8.dp),

            )
        Text(
                text=first,
                fontSize=16.sp,
                modifier= Modifier,

        )

    }

}

@Preview(showBackground = true,
    showSystemUi=true,
    name="My Preview")
@Composable
fun UIFunctionPreview() {
    TaskManagerAppTheme {
        UIFunction(stringResource(R.string.heading_text),
            stringResource(R.string.first_para)
        )
    }
}