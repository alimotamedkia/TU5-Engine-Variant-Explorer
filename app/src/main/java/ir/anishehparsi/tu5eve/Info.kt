package ir.anishehparsi.tu5eve

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun Info(modifier: Modifier = Modifier) {

    val vazirFont = FontFamily(Font(R.font.vazirmatn))

    CompositionLocalProvider(androidx.compose.ui.platform.LocalLayoutDirection provides LayoutDirection.Rtl) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "این اپلیکیشن با نام TU5 Engine Variant Explorer که به اختصار TU5 EVE نامیده شده است، جهت شناسایی قطعات مختلف واریانت‌های موجود خانواده موتورهای TU5 طراحی شده است.",
                textAlign = TextAlign.Start,
                fontSize = 16.sp,
                fontFamily = vazirFont,
                lineHeight = 32.sp,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "تاریخ به‌روزرسانی:",
                    fontFamily = vazirFont
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "۱۴۰۴/۰۱/۲۹",
                    fontFamily = vazirFont,
                    fontWeight = FontWeight.Black
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "ایده:",
                    fontFamily = vazirFont
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "علی رضایی",
                    fontFamily = vazirFont,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "برنامه‌نویسی و اجرا:",
                    fontFamily = vazirFont
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "اندیشه پارسی (علی معتمدکیا)",
                    fontFamily = vazirFont,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

