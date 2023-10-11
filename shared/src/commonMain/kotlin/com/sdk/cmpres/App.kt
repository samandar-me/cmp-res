package com.sdk.cmpres

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mohamedrejeb.calf.ui.toggle.AdaptiveSwitch
import dev.icerock.moko.resources.compose.fontFamilyResource
import dev.icerock.moko.resources.compose.painterResource
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun App() {
    var selected by remember { mutableStateOf(false) }



    Scaffold {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AdaptiveSwitch(
                checked = selected,
                onCheckedChange = {
                    selected = !selected
                }
            )
//            NativeLoading()
//        Text(
//            text = stringResource(MR.strings.app_name),
//            fontFamily = fontFamilyResource(MR.fonts.Inter.regular)
//        )
//        Spacer(Modifier.height(20.dp))
//        Image(
//            painter = painterResource(MR.images.avatar2),
//            contentDescription = null
//        )
        }
    }
}