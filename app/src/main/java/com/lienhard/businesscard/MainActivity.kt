package com.lienhard.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lienhard.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Martin",
                        title = "Android Developer Extraordinaire",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        Modifier
            .fillMaxWidth()
            .background(Color.Green)
    ) {
        Row(
            modifier = modifier.weight(1f)
        ) {
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.android_logo),
                    contentDescription = "Android logo",
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp)
                        .background(Color.Black)
                )
                Text(
                    text = name,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = modifier
                )
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                )
            }
        }

        Row(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 5.dp, bottom = 5.dp),
        ) {
            Column(
                modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row() {
                    Column(
                        modifier = modifier.padding(start = 8.dp, end = 8.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Icon(Icons.Filled.Call, "phone")
                    }
                    Column(
                        modifier = modifier.padding(start = 8.dp, end = 8.dp),
                        horizontalAlignment = Alignment.End
                    ) {
                        Text(
                            text = "+1 (123) 456-7890",
                            modifier = modifier
                        )
                    }
                }
            }
        }

        Row(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 5.dp, bottom = 5.dp),
        ) {
            Column(
                modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row() {
                    Column(
                        modifier = modifier.padding(start = 8.dp, end = 8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(Icons.Filled.Share, "share")
                    }
                    Column(
                        modifier = modifier.padding(start = 8.dp, end = 8.dp),
                        horizontalAlignment = Alignment.End
                    ) {
                        Text(
                            text = "@AndroidDev",
                            modifier = modifier
                        )
                    }
                }
            }
        }

        Row(
            //horizontalArrangement = Arrangement.End
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 5.dp, bottom = 5.dp)
                .weight(0.1f)
        ) {
            Column(
                modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row() {
                    Column(
                        modifier = modifier.padding(start = 8.dp, end = 8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(Icons.Filled.Email, "email")
                    }
                    Column(
                        modifier = modifier.padding(start = 8.dp, end = 8.dp),
                        horizontalAlignment = Alignment.End
                    ) {
                        Text(
                            text = "martin@android.com",
                            modifier = modifier
                        )
                    }
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Greeting(
            name = "Martin",
            title = "Android Developer Extraordinaire"
        )
    }
}