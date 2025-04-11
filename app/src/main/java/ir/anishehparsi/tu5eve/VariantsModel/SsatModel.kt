package ir.anishehparsi.tu5eve.VariantsModel

data class SsatModel(
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
    val electricalType: String
)
val variantInboxSsat = listOf(
    SsatModel(
        "SMB",
        "موتور TU5",
        "دستی",
        "207 SSAT",
        "IK01253780",
        "TU5",
        "برقی",
        "166B",
        "172B",
        "تهران - مونتاژ 4",
        "SSAT"
    ),
    SsatModel(
        "SMR",
        "موتور TU5",
        "دستی",
        "پارس SSAT",
        "IK01266180",
        "TU5",
        "سیمی",
        "139B",
        "172B",
        "فارس - مازندران - خراسان - کرمانشاه",
        "SSAT"
    ),
    SsatModel(
        "SMP",
        "موتور TU5",
        "دستی",
        "پارس SSAT",
        "IK01253680",
        "TU5",
        "برقی",
        "139B",
        "172B",
        "فارس - مازندران - خراسان - کرمانشاه",
        "SSAT"
    ),
    SsatModel(
        "SAC",
        "موتور TU5P اتوماتیک",
        "اتوماتیک",
        "تارا اتوماتیک",
        "IK01404480",
        "TU5P",
        "برقی",
        "187B",
        "187B",
        "تهران - مونتاژ 1",
        "SSAT"
    ),
    SsatModel(
        "SAS",
        "موتور TU5P اتوماتیک صادراتی",
        "اتوماتیک",
        "تارا صادراتی اتوماتیک ",
        "YG22245082",
        "TU5P",
        "برقی",
        "187B",
        "187B",
        "تهران - مونتاژ 1",
        "SSAT"
    ),
    SsatModel(
        "SEA",
        "موتور TU5P",
        "دستی",
        "تارا دستی",
        "IK01265180",
        "TU5P",
        "برقی",
        "187B",
        "187B",
        "تهران - مونتاژ 1",
        "SSAT"
    ),
    SsatModel(
        "SEB",
        "موتور TU5P گیربکس MT6 با S2",
        "دستی",
        "سازه پویش MT6 S2",
        "IK01825780",
        "TU5P",
        "برقی",
        "187B",
        "188B",
        "تهران - مونتاژ 1",
        "SSAT"
    )
)

