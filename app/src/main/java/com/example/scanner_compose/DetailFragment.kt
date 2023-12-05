package com.example.scanner_compose

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material3.Text
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import es.clean.architecture.R

@Composable
fun DetailScreen(
    qr: String
) {
    val context = LocalContext.current
    Column(modifier = Modifier.fillMaxSize()) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .background(Color.White),
            horizontalArrangement = Arrangement.Center
        ) {

            Text(
                text = qr,
                fontSize = 20.sp,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                color = Color.Black
            )

                when (qr) {
                    "Success" -> {
                        LottieSuccess()
                    }

                    "Error" -> {
                        LottieError()
                    }

                    else -> {
                        Toast.makeText(context, "No hay nada que mostrar", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }
        }
}


@Composable
fun LottieSuccess() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.success))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(
        composition = composition,
        progress = { progress },
        modifier = Modifier.fillMaxSize()
    )

}

@Composable
fun LottieError() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.error))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(
        composition = composition,
        progress = { progress },
        modifier = Modifier.fillMaxSize()
    )

}

@Preview
@Composable
fun showDetailScreen() {
    DetailScreen(qr = "Success")
}