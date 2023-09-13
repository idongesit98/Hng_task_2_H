package com.zseni.hng_task_2.presentation.featureAdd.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.zseni.hng_task_2.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldsCv(
    text: String,
    //hint: String,
    //isHintVisible:Boolean = true,
    onValueChange:(String)->Unit,
    textStyle: TextStyle = TextStyle(),
    singleLine:Boolean = false,
    onFocusChange:(FocusState) -> Unit
) {
    Box(modifier = Modifier) {
        OutlinedTextField(
            value = text,
            leadingIcon = {
                Icon(
                    imageVector = Icons.TwoTone.Info,
                    contentDescription = stringResource(id = R.string.field_icon),
                )
            },
            onValueChange = onValueChange,
            singleLine = singleLine,
            textStyle = textStyle,
            modifier = Modifier
                .fillMaxWidth()
                .onFocusChanged {
                    onFocusChange(it)
                }


        )
        /**
        if (isHintVisible){
        Text(text = hint, style = textStyle, color = Color.DarkGray)

        }
         **/

    }
}


    @Preview(showBackground = true)
    @Composable
    fun TextFieldPreview() {
        var text by remember { mutableStateOf("Initial Text") }
        TextFieldsCv(
            text = text,
            //hint = "Enter text...",
            onValueChange = {
                text = it})
        {
            // Handle focus change if needed
        }
    }


