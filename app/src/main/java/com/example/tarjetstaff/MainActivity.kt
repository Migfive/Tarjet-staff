package com.example.tarjetstaff

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetstaff.ui.theme.TarjetStaffTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetStaffTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF83D7C6))) { innerPadding ->
                    Greeting(
                        messageCol1 = stringResource(R.string.miguel_santa),
                        title = stringResource(R.string.android_developer_expert),
                        message1 = stringResource(R.string._57_3245709085),
                        message2 = stringResource(R.string.mg_angelll),
                        message3 = stringResource(R.string.santamiguelangel62_gmail_com),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun GreetingCol1(message:String, title:String, modifier: Modifier=Modifier){
    val image = painterResource(R.drawable.perfil)
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter = image , contentDescription = null, modifier = Modifier
            .size(150.dp)
            .padding(5.dp)
            .clip(CircleShape)
        , contentScale = ContentScale.Crop)
        Text(text = message, fontSize =34.sp)
        Text(text = title)
   }
}


@Composable
fun GreetingCol2(message1:String, message2: String,message3: String, modifier: Modifier=Modifier){
    Column(modifier= modifier.padding(top = 36.dp),
        verticalArrangement = Arrangement.Bottom,

        ) {
        Row(modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            , horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(R.drawable.baseline_phone_24), contentDescription = null
            ,modifier = Modifier, tint = colorResource(R.color.icons))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = message1, fontSize =15.sp)
        }
        Row(modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            , horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(R.drawable.baseline_share_24), contentDescription = null
            ,modifier = Modifier.padding(end =8.dp), tint = colorResource(R.color.icons))
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = message2, modifier = Modifier.padding(end =13.dp))
        }
        Row(modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            , horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(R.drawable.baseline_email_24), contentDescription = null,
                tint = colorResource(R.color.icons))
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = message3)
        }
    }
}

@Composable
fun Greeting(
    messageCol1: String, title: String,
    message1:String, message2: String,message3: String,
    modifier: Modifier = Modifier)
{
    Box(modifier = Modifier.background(Color(0xFF83D7C6))) {
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            GreetingCol1(message = messageCol1, title = title, modifier = Modifier)

        }
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GreetingCol2(
                message1 = message1,
                message2 = message2,
                message3 = message3,
                modifier = Modifier.padding(bottom = 15.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetStaffTheme {
        Box (modifier = Modifier
            .fillMaxSize()){
            Greeting(
                messageCol1 = stringResource(R.string.miguel_santa),
                title = stringResource(R.string.android_developer_expert),
                message1 = stringResource(R.string._57_3245709085),
                message2 = stringResource(R.string.mg_angelll),
                message3 = stringResource(R.string.santamiguelangel62_gmail_com)
            )
        }
    }
}