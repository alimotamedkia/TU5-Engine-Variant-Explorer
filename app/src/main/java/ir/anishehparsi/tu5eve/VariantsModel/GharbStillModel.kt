package ir.anishehparsi.tu5eve.VariantsModel

data class GharbStillModel(
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

val variantInboxGharbStill = listOf(
    GharbStillModel(
        "RGF",
        "موتور tu5",
        "دستی",
        "207 غرب استیل",
        "IK01275480",
        "TU5",
        "دستی",
        "167B",
        "172B",
        "تهران - مونتاژ 4",
        "غرب استیل"
    ),
    GharbStillModel(
        "RGH",
        "موتور tu5",
        "دستی",
        "رانا غرب استیل",
        "IK00488680",
        "TU5",
        "برقی",
        "167B",
        "172B",
        "تهران - مونتاژ 4",
        "غرب استیل"
    ),
    GharbStillModel(
        "GMP",
        "موتور tu5",
        "دستی",
        "پارس غرب استیل",
        "IK01253580",
        "TU5",
        "برقی",
        "167B",
        "172B",
        "کرمانشاه - خراسان",
        "غرب استیل"
    ),
    GharbStillModel(
        "GEB",
        "موتور tu5P",
        "دستی",
        "207 غرب استیل شش سرعته",
        "IK01826880",
        "TU5P",
        "برقی",
        "175B",
        "188B",
        "تهران - مونتاژ 4",
        "غرب استیل"
    )
)