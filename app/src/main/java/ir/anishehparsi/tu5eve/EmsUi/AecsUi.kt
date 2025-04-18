package ir.anishehparsi.tu5eve.EmsUi

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.anishehparsi.tu5eve.R
import ir.anishehparsi.tu5eve.VariantsModel.Models

@Composable
fun AecsUi(modifier: Modifier = Modifier, item: Models) {
    OutlinedCard(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(modifier.padding(vertical = 8.dp, horizontal = 16.dp)) {
            Text(
                text = item.title,
                fontSize = 48.sp,
                fontFamily = FontFamily(Font(R.font.adlam_display))
            )
            Spacer(modifier = Modifier.weight(0.15f))
            Text(text = item.newCode)
            Spacer(modifier = Modifier.weight(1f))
            Column {
                Spacer(modifier.height(32.dp))
                Text(
                    text = "\u200F" + item.productType,
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}



