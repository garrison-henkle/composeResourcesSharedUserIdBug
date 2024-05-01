package dev.henkle.bug

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import shareduseridbugexample.composeapp.generated.resources.Res
import shareduseridbugexample.composeapp.generated.resources.compose_multiplatform

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalResourceApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Image(painterResource(Res.drawable.compose_multiplatform), null)
        }
    }
}
