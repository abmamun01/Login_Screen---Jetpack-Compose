package com.mamunsproject.login_ui_jetpackcompose

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.mamunsproject.login_ui_jetpackcompose.ui.theme.Black
import com.mamunsproject.login_ui_jetpackcompose.ui.theme.focusedTextFieldText
import com.mamunsproject.login_ui_jetpackcompose.ui.theme.textFieldContainer
import com.mamunsproject.login_ui_jetpackcompose.ui.theme.unfocusedTextFieldText


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginTextField(
    modifier: Modifier = Modifier,
    label: String,
    trailing: String
) {
    val uiColor = if (isSystemInDarkTheme()) Color.White else Black

    TextField(
        value = "",
        onValueChange = {},
        label = {
            Text(text = label, style = MaterialTheme.typography.labelMedium, color = uiColor)
        },
        colors = TextFieldDefaults.textFieldColors(

            unfocusedSupportingTextColor = MaterialTheme.colorScheme.unfocusedTextFieldText,
            focusedSupportingTextColor = MaterialTheme.colorScheme.focusedTextFieldText,
            unfocusedLabelColor = MaterialTheme.colorScheme.textFieldContainer,
            focusedLabelColor = MaterialTheme.colorScheme.textFieldContainer,
        ),
        trailingIcon = {
            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    text = trailing,
                    style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Medium),
                    color = uiColor
                )

            }
        }
    )
}