package ir.anishehparsi.tu5eve.VariantsModel

data class MulhouseModel(
    val title: String,
    val description: String,
    val gearboxType: String,
    val productType: String,
    val technicalNumber: String,
    val engineType: String,
    val throttleType: String,
    val oldCode: String,
    val newCode: String,
    val customerSite: String,
    val electricalType: String,
)

val variantInboxMulhouse = listOf(
    MulhouseModel(
        "BWX",
        "مولوز (بوش)",
        "دستی",
        "موتور 207 دستی",
        "9800007980",
        "TU5",
        "برقی",
        "156",
        "174",
        "تهران - مونتاژ 4",
        "پک مولوز"
    )
)
