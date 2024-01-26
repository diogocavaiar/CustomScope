package br.com.dmcconsulting.customscope.ui.component

import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@Composable
fun OutlinedButtonDS(textId: Int) {
    OutlinedButton(onClick = {}) {
        LabelMediumText(text = stringResource(id = textId))
    }
}