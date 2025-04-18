package ir.anishehparsi.tu5eve.EmssList

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import ir.anishehparsi.tu5eve.EmsUi.AecsUi
import ir.anishehparsi.tu5eve.VariantsModel.variantInboxAecs

@Destination
@Composable
fun AecsList(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.padding(horizontal = 16.dp)) {
        items(variantInboxAecs) {
            AecsUi(item = it)
            Spacer(modifier = Modifier.padding(vertical = 4.dp))
        }
    }

}