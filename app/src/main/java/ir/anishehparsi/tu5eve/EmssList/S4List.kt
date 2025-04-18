package ir.anishehparsi.tu5eve.EmssList

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import ir.anishehparsi.tu5eve.EmsUi.S4Ui
import ir.anishehparsi.tu5eve.VariantsModel.variantInboxS4

@Destination
@Composable
fun S4List(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.padding(horizontal = 16.dp)) {
        items(variantInboxS4) {
            S4Ui(item = it)
            Spacer(modifier = Modifier.padding(vertical = 4.dp))
        }
    }

}