package br.com.dmcconsulting.customscope.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

interface CustomScope {
    fun item(textId: Int)
}

private class CustomScopeImpl : CustomScope {

    val items = mutableListOf<@Composable () -> Unit>()

    override fun item(textId: Int) {
        items += {
            OutlinedButtonDS(textId = textId)
        }
    }
}

@Composable
fun ColumnListCustomScope(
    modifier: Modifier = Modifier,
    verticalArrangement: Arrangement.HorizontalOrVertical = Arrangement.Center,
    horizontalAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    content: CustomScope.() -> Unit
) {
    val scope = remember(content) { CustomScopeImpl().apply(content) }

    LazyColumn(
        modifier = modifier,
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment,
    ) {
        items(
            items = scope.items,
            key = { it.hashCode() }
        ) { item ->
            item()
        }
    }
}
