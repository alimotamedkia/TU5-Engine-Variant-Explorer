package ir.anishehparsi.tu5eve.VariantPages

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import ir.anishehparsi.tu5eve.R
import ir.anishehparsi.tu5eve.VariantsModel.Models
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color


@Destination
@Composable
fun AatPage(modifier: Modifier = Modifier, item: Models) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = item.title,
            fontSize = 48.sp,
            fontFamily = FontFamily(Font(R.font.adlam_display))
        )
        Text(
            text = item.electricalType,
            fontFamily = FontFamily(Font(R.font.vazirmatn_bold))
        )
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
        ) {
            Text(
                text = item.engineType,
                fontFamily = FontFamily(Font(R.font.vazirmatn_bold))
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = item.newCode,
                fontFamily = FontFamily(Font(R.font.vazirmatn_bold))
            )
        }
        Spacer(modifier = modifier.size(8.dp))
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
        ) {
            Text(
                text = "\u200F" + item.customerSite,
                fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                textAlign = TextAlign.Right
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "\u200F" + item.productType,
                fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                textAlign = TextAlign.Right
            )

        }
        Spacer(modifier = modifier.size(32.dp))
        Column(
            modifier = Modifier
                .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp))
                .fillMaxWidth()
                .padding(8.dp)
                .verticalScroll(rememberScrollState()),  // 👈 این خط اضافه بشه
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.oxygenSensor)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "سنسور اکسیژن",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.knockSensor)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "سنسور ضربه",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.throttle)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "دریچه گاز",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.wob)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "WOB",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.wib)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "WIB",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.tmapSensor)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "T-Map",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.manifold)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "منیفولد هوا",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.injector)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "انژکتور",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.underCover)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "قاب زیرین تایم",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.flywheel)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "فلایویل",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            //
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.sparkPlugProtector)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "محافظ شمع",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.airCamshaftSeal)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "سیل میل بادامک هوا",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.exhaustCamshaftSeal)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "سیل میل بادامک دود",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.waterPump)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "واتر پمپ",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.airCamshaft)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "میل بادامک هوا",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.exhaustCamshaft)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "میل بادامک دود",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.engineHandel)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "دسته موتور",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.diskPlate)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "دیسک و صفحه",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.positionSensor)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "سنسور موقعیت",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.crankShaft)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "میل لنگ",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.valveSpring)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "فنر سوپاپ",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.cylinderHead)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "سرسیلندر",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.cylinder)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "بلوکه سیلندر",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.tHydraulic)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "هیدرولیک تایپیت",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.airCamshaftGear)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "چرخدنده میل بادامک هوا",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.exhaustCamshaftGear)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "چرخ‌دنده میل بادامک دود",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.crankshaftGear)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "چرخ‌دنده میل‌لنگ",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.oilPump)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "اویل پمپ",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.oilPumpCasing)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "زنجیر اویل پمپ",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.connectingRodPiston)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "پیستون و شاتون",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Text(text = item.coil)
                Spacer(modifier = modifier.weight(1f))
                Text(
                    text = "\u200F" + "کویل",
                    fontFamily = FontFamily(Font(R.font.vazirmatn_bold)),
                    textAlign = TextAlign.Right
                )
            }
        }
    }
}
