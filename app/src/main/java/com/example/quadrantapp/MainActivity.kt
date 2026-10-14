package com.example.quadrantapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quadrantapp.ui.theme.QuadrantAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantAppTheme {
                QuadrantApp(
                    heading1 = stringResource(R.string.quadrant_one_heading),
                    heading2 = stringResource(R.string.quadrant_two_heading),
                    heading3 = stringResource(R.string.quadrant_three_heading),
                    heading4 = stringResource(R.string.quadrant_four_heading),
                    paragraph1 = stringResource(R.string.quadrant_one_paragraph),
                    paragraph2 = stringResource(R.string.quadrant_two_paragraph),
                    paragraph3 = stringResource(R.string.quadrant_three_paragraph),
                    paragraph4 = stringResource(R.string.quadrant_four_paragraph)
                )
            }
        }
    }
}

@Composable
fun QuadrantApp(
    heading1: String, heading2: String, heading3: String, heading4: String,
    paragraph1: String, paragraph2: String, paragraph3: String, paragraph4: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            Card(modifier = Modifier.weight(1f).fillMaxSize(),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFEADDFF))
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp).fillMaxSize()
                ) {
                    Text(
                        text = heading1,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)

                    )
                    Text(
                        text = paragraph1,
                        textAlign = TextAlign.Justify
                    )
                }
            }

            Card(modifier = Modifier.weight(1f).fillMaxSize(),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFD0BCFF))
            ) {
                Column(
                    modifier = Modifier.padding(16.dp).fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = heading2,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = paragraph2,
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }

        Row(modifier = Modifier.weight(1f)) {
            Card(modifier = Modifier.weight(1f).fillMaxSize(),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFB69DF8))
                ) {
                Column(
                    modifier = Modifier.padding(16.dp).fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = heading3,
                        modifier = Modifier.padding(bottom = 16.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = paragraph3,
                        textAlign = TextAlign.Justify
                    )
                }
            }

            Card(modifier = Modifier.weight(1f).fillMaxSize(),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFF6EDFF))) {
                Column(
                    modifier = Modifier.padding(16.dp).fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = heading4,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = paragraph4,
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantAppTheme {
        QuadrantApp(
            heading1 = stringResource(R.string.quadrant_one_heading),
            heading2 = stringResource(R.string.quadrant_two_heading),
            heading3 = stringResource(R.string.quadrant_three_heading),
            heading4 = stringResource(R.string.quadrant_four_heading),
            paragraph1 = stringResource(R.string.quadrant_one_paragraph),
            paragraph2 = stringResource(R.string.quadrant_two_paragraph),
            paragraph3 = stringResource(R.string.quadrant_three_paragraph),
            paragraph4 = stringResource(R.string.quadrant_four_paragraph)
        )
    }
}