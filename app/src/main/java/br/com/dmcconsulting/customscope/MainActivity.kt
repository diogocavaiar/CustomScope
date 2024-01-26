package br.com.dmcconsulting.customscope

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import br.com.dmcconsulting.customscope.ui.component.ColumnListCustomScope
import br.com.dmcconsulting.customscope.ui.theme.CustomScopeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomScopeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ColumnListCustomScope {
                        item(R.string.button_text_one)
                        item(R.string.button_text_two)
                        item(R.string.button_text_three)
                        item(R.string.button_text_four)
                        item(R.string.button_text_five)
                    }
                }
            }
        }
    }
}